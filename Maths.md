Wargames are games of strategy and probability. Strategy emerges as the game ages, mathematics however is at its core and defines the meta.

## Attack Kill Likelihood
So heres some maths for you:

How likely is it that I’m going to kill with my attack?

For any single target,

$$1-\left(1-\frac{(\text{damage}-\text{armour})(20-\mathrm{MOT}+\mathrm{APT}+\text{modifiers})}{400}\right)^\text{attacks}$$

This calculates how likely they are to take at least one structure damage. For most models, that means death.

This would make the game lethal. Take a person who is trained in a motoric skill and who has proficiency in firearms. They would be 77% likely to kill an unarmoured target with an industrial repeater within optimal range bands, if they used both shots on that target. With only one shot, they would be 42% likely to kill their target.

Heres some of the equations I had to make to derive the above one.
$$\text{probability of hit} = \frac{20 - \mathrm{MOT} + \mathrm{APT} + \text{modifiers}}{20}$$
$$\text{probability of kill with hit}=\frac{\text{damage}-\text{armour}}{20}$$

Sure you could figure out the rest.

This equation is useful for designing weapons. While a 77% chance to kill with a repeater might seem nasty, the chance drops to 39% when making the same attack with a bow. I’m no expert in warfare, but to me it seems intuitive to have these kinds of odds.

For some more calculations, to understand the system, if the target was wearing full metal plate, the probability of death would drop to 54%

## Team Success Distribution
The idea of distribution rolls is modelling that if each team member rolled the dice individually, the number of successes and fails is likely to be different. 
For this reason, the distribution of rolls is simulated around a mean roll - which is the team roll.
In distribution rolls, there are 2 random variables, some independent variables and many calculated variables.
r is the team roll, s is the success value, d is the distribution roll, and n is the number of models in the team.
If we rolled every model's d20 individually, their success would fall under a normal distribution as described by the Bernoulli function. TO approximate this, we just use a discrete distribution by getting the sum of 2 dice rolls. 
The distribution dice was modelled after the distribution of a 2d5 roll, which looks like this:
![[2d5 distribution.png]]
The actual distribution value is calculated with 2r-6, where r is the sum of the 2d5 roll, but this calculation is unnecessary if we use a custom built five sided dice with the sides (-4, -2, 0, +2, +4). This dice does not exist, and I'd have to 3d print it or ask for a custom order from some dice place.
I've also considered using d6s for this, which would make the distribution roll more chaotic and lower the chance it does nothing.

The distribution roll is supposed to represent how many models rolled higher or lower than the mean. If you matched the success value with the team roll, rolling a low distribution would mean that models fail anyway because of the simulated distribution of d20 rolls per model. If you rolled just underneath the success value, then you'd have to roll a high distribution to have any chance of success. In these scenarios, the best or worst you can get is 80% of your team failing anyway / succeeding anyway due to the extreme distribution rolls being -8 and +8, which each only have a 4% chance of occurring compared to the much more common 0 which will happen in 1 of 5 rolls. 

The way this works, there's essentially always a 60% chance that the distribution roll does not matter at all. The distribution roll is mostly just there to add flavour to an otherwise flat everyone succeeds / everyone fails roll.

But if the team roll is significantly higher than the target, a bad distribution will still land most of the models safely in the success value. This is why a buffer b is calculated with r - s. This lets a number of models on a bad distribution succeed anyway because the mean roll was high enough.
Then, the number of models that succeed anyway or fail anyway is simply f = b + d. This means if you have a negative buffer but rolled a good distribution, some of the models fail anyway and vice versa. 

This whole system is designed for a team with 10 models, but this might not be the actual case, so we have to make it proportional to the size of the actual team using n/10 * f. The issue with this is that it often provides bad fractions to work with, which is why I suggest rounding the number of models to the nearest 5, which can help but still provide non-integer values. Rounding to the nearest 10 would guarantee integer values and also make the distribution part of the roll needless for teams of 5 or less. 

So to summarise, here is the entire calculation
$$\text{succeeding models}=\frac{\text{round}(n)}{10}\times \left( (r-s)+d\right)$$
where succeeding models is the number of models that succeed anyway if positive and fail anyway if negative. r is the team roll, s is the success value, and d is the distribution roll. round(n) is a function that either rounds to the nearest multiple of 5 or the nearest multiple of 10 depending on how clean you want the division to be.