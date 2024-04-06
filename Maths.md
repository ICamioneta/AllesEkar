Wargames are games of strategy and probability. Strategy emerges as the game ages, mathematics however is at its core and defines the meta.

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