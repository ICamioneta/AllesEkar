# Introduction
Welcome to Allesfezs Ekarschubi, a tabletop wargaming system that transcends eras and scales, offering an immersive experience in strategic combat. Developed with a vision to encompass a bredth of warfare, from ancient battles to futuristic conflicts, this game attempts to bring together diverse units, skills, and tactics for players to explore.
## Embracing all eras of combat
Allesfezs Ekarschubi is designed to encapsulate the essence of warfare, allowing players to engage in battles across various historical periods and speculative future scenarios. Whether its ancient sword clashes or high-tech skirmishes, this game adapts to all eras, providing a comprehensive gaming experience. Due to the vary nature of this system, it allows players to match up the medieval knight to the modern infantryman, bridging the gap of time and expanding warfare’s capabilities.
## Active-Reactive gameplay
One of the defining features of this system is its active-reactive system. Players remain engaged throughout the game, even during their opponent’s active turn. Units react to opposing unit’s actions, ensuring continuous involvement and strategic decision making, keeping the battlefield dynamic and intense.
## Scalability
This game’s system allows for versatile combat scenarios, accommodating small skirmishes or large-scale warfare. At the heart of the game are units, encompassing individual models or groups with shared attributes and skills. Whether they’re standard foot soldiers, monstrous beings, or crewed vehicles, each unit plays a vital role in shaping the battlefield and influencing outcomes.
## Progression
Players have the option to undertake narrative driven battles by playing as part of a campaign. Units can gain experience in battle, improving their capabilities for the next battle in a player-driven campaign.
# Core Concepts
## Units
A unit is the core element of the game. Units have profiles that define their attributes, skills, and equipment. Units are models that can move, shoot, and perform other actions during a battle. There are several different types of units that are all treated slightly differently.
- Agent. An Agent is a unit represented by a single model who acts independently. This is the default, unspecified unit.
- Team. A team unit consists of several models all acting as one. This reduces the flexibility of each model but improves game flow and reduces overhead as large numbers of models can be treated as a reasonable number of units. Teams have different rolling means, and actions are handled differently.
- Vehicles. Empty vehicles become units while piloted. Piloting units forgive their independence to pilot vehicles, producing a powerful unit in return. Each vehicle acts differently, but often when vehicles are destroyed piloting units can survive.
### The Unit Profile
Most unit profiles are represented quite simply by a table.

|   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|
|Polish Winged Hussar (17th century)|   |   |   |   |   |   |   |   |
|MOT|PHY|WIL|STR|MOV|WSCC|WSCR|ARM|REC|
|10|10|11|1|5”|+6|n/a|?|2|
|One Handed Striking (+6), Lance (+6), Pilot (+6), Agility (+4)|   |   |   |   |   |   |   |   |
|Equipment: Sword, Lance, Metal Armour, Horse|   |   |   |   |   |   |   |   |

The first line is the unit’s title. This should be unique, but given the nature of the game this might not be possible.

The next line is a proper table of 9 attributes. These are described later.

The next line is where the skills go. These are written, and then their aptitude is placed in brackets afterwards.

Equipment comes after that, where each item of equipment is specified. There are lists of equipment later in the rules that you can refer to. Many units have variable equipment. This is represented as a choice within square brackets separated by a line. For example, [Sword | Spear | Poleaxe]. If it makes sense, like if its on the model, more than one of these may be equipped for example a medieval knight wielding a polearm with a sheathed sword.

Quite often, units have access to some kind of magic equivalent. This usually comes on a line after the equipment and should be intuitive to read.
### Vehicles
Vehicles and their profiles are split into seats. Each seat enables a certain component of the vehicle. The most common is the driver seat, which always enables the Move of a vehicle. Vehicles also often have weapons. Each seat will activate different weaponry.
## Attributes
The first and most defining aspect of a unit’s profile are their attributes, both primary and secondary. Primary attributes form the unit’s core capabilities, whereas secondary attributes are skills and parts of equipment that are crucial to gameplay and are displayed clearly to avoid time lost while searching a units profile. The primary attributes follow.
·         Motorics (MOT). A unit’s motoric attribute represents their hand-eye coordination, perception, reaction speed, and interfacing abilities. It is important when making attacks, piloting vehicles, and interfacing with interactable scenario objects. It determines how many reactions a unit gets, and how easily they can detect hidden units.

·         Physique (PHY). A unit’s physical capabilities such as strength and dexterity. It is used when dodging or blocking attacks, as a damage number for many melee attacks, and more. It is used when determining a unit’s movement speed and for many resistance checks.

·         Willpower (WIL). Willpower encompasses a unit’s mental abilities such as leadership and intelligence. It is used for pressure tests, and if it is applicable, willpower is the core attribute of all forms of magic.

·         Structure (STR). Structure determines how many successful, unblocked hits a unit can take. It is fairly immutable.

Secondary attributes are important things to know at all times, but are derived by other means. These follow.
- Movement (MOV). This is the maximum distance a unit can move when using the movement action.
- Weapon Skill Class Aptitudes. These are often two numbers that represent a unit’s aptitude for their primary weapons, both for close combat and ranged combat. These are split into two different secondary attributes;
	 - Weapon Skill Class Close-Quarters (WSCC). This is the unit’s aptitude with their primary close quarters weapon.
	- Weapon Skill Class Ranged (WSCR). This is the unit’s aptitude with their primary ranged weapon.
- Armour (ARM). Armour is based on a unit’s equipment and what armour they are wearing. Different armours resist different types of weapon, but all armours offer a generic protection number.
- Reactions (REC). As previously mentioned, reactions are determined by a unit’s motoric attribute, but is displayed as a secondary attribute due to its importance. This is how many times a unit gets to react during an enemy’s active turn.

In Allesfezs Ekarschubi, attributes are based on ordinality (as in 1st, 2nd, 3rd, etc). That means that lower numbers are better. When performing a check, you will have to roll a d20 with the target of surpassing the primary attribute related to that check, which will be modified using several modifiers that apply to that type of action. The most common modifier is a skill aptitude, which is covered later in this section.

Here are tables to determine your movement and reactions attributes:

|   |   |   |   |
|---|---|---|---|
|Movement (PHY)|   |Reactions (MOT)|   |
|>15|3”|>14|1|
|14, 13|4”|13, 12|2|
|12, 11|5”|11, 10|3|
|10, 9|6”|9, 8|4|
|<8|7”|<7|5|

## Skill Checks
Several times in the game you are required to perform a skill check. The skill is specified, and each skill is attached to a primary attribute. A check is made with a d20, against a target value. This target value starts as the attribute the check is made against, minus any modifiers. Modifiers come in many forms, but are most commonly skill aptitudes. If a modifier is negative, you add it to the target value. The d20 roll must be greater than or equal to the target value to be considered a success.

If the d20 rolls a 20, it is considered a critical success. If it rolls 1, it is a critical failure. Critical successes always succeed, and critical failures always fail. Sometimes, additional effects will occur if you roll a critical success or a critical failure. If a critical success is the only way the roll can succeed, the extra effects do not occur, and the roll is treated as a normal success. If the target value, through modifiers, reaches 1, any additional modifiers lower the boundary of a critical success.

In a face-to-face roll, two or more players roll their dice at once. Each player will have a different skill to check and must succeed their skill check for their dice to be considered. Then, successful dice rolls cancel out opponent dice rolls that were lower. You make this assessment from low to high dice, meaning that dice that are cancelled can still cancel lower ones. Cancelled rolls are failures.
## Turn structure
During a turn, one player will be the active player and other players will be reactive. Usually, there are only two players, but Allesfezs Ekarschubi accommodates several players playing at once. At the start of each game, players will do a face-to-face roll that tests their highest unit’s leadership. Each player must succeed the test. If they fail the test, they go last. The player with the highest number gets the first active turn, then the player with the second highest gets the second active turn, and so on. If there are any ties, a simple tie breaker roll can be done. When the last player’s active turn is over, the first player becomes the active player again, and the first order of initiatives is preserved for all consecutive turns.

Players deploy on the battlefield wholly depending on their initiative order. The player that goes first deploys first, then the second player deploys and so on. Players deploy their units within a deployment zone, which is dependent on the scenario. Often, deployment zones are a fixed distance away from two opposing board edges, but different scenarios can handle this differently.

During a turn, the active player will activate each of their units in an order of their choice and perform that unit’s actions. Each unit gets two actions: a movement action and another action. During the first movement action, players may only perform movement actions. During the second action, however, players can perform actions and movement actions. Some actions are ‘long actions’, which are actions that take an entire activation to do.

When a player activates a unit and completes their movement action, opposing player’s units will get the chance to use one of their reactions on that unit. They decide on which of the reactions they will use, then the active player decides on the second action of their unit. In this game, all of these actions happen simultaneously, meaning that for the purposes of targeting and cover, players can choose where during the moving unit’s movement they do their action. This means that if a unit moves between to pieces of obscuring cover, they may choose that their second attack action happens while their unit was in-between the two pieces of cover. Similarly, reacting units can choose when in the movement their attack was made, which in this case would be beneficial if the attack was made when the active unit was out in the open.

Players decide in which order rolls are done. Some actions oppose each other, for example if a unit makes a dodge/adjust action and another unit makes an attack action, the dodge action will have a chance to cancel out the attacks.

After each of the active player’s units have been activated, their turn is over and the next player in the initiative order becomes the active player for a new turn.
## Actions and Reactions
During their activation, a unit gets to make one movement action and another action. A summary of each action is defined here, but for a comprehensive view of what each action does, view the action section.

Movement actions

- Move. A unit moves a distance up to their movement.
- Reload. A unit reloads a weapon.
- Idle. A unit does nothing for this action.
- Discover. A unit attempts to reveal hidden units that are in stealth.

Actions

- Attack. A unit makes an attack with one of their weapons.
- Interface. A unit interacts with a scenario object.
- Dodge/Adjust. A unit attempts to negate incoming attacks while still moving an additional distance.
- Block. A unit attempts to negate incoming attacks more efficiently than dodging.
- Magic. A unit attempts to perform an action magic, which has various effects.
- Items and special skills. A unit uses an action item, or a special skill, that is used as an action.

Reactions

If at any point along an activated unit’s movement it enters another player’s unit’s line-of-sight or zone-of-control, that unit may choose to take a reaction on it. The number of reactions a unit can make per turn is finite and defined by their MOT attribute. Here are the reactions, and a summary of what they do.

- Attack. A reacting unit attempts to attack the activated unit.
- Discover. A reacting unit takes the chance to discover a hidden unit in stealth.
- Dodge/Adjust. A reacting unit adjusts their position, potentially avoiding incoming attacks.
- Block. A reacting unit attempts to block an incoming attack.
- Magic. A reacting unit uses a reaction magic.
- Items and special skills. A reacting unit uses a reaction item or a reaction special skill.

Full actions

At the start of a unit’s activation, instead of using a movement action they may choose to use a full action. These actions use up the entirety of a unit’s activation, and still provokes reactions.

- Acrobatics. The unit attempts to navigate terrain by jumping, climbing, or with other appropriate movements.
- Hidden Move. A unit in stealth makes a hidden move to cross enemy lines of fire or zones of control without provoking reacitons.
- Magics. The unit performs a full action magic.
- Items and special skills. A unit uses a full action item or a full action special skill.
## Skills
Skills are another core aspect of a unit’s profile. They are sorted based on aptitudes, but the name given to these aptitudes ultimately doesn’t change that they are modifiers for rolls. The aptitudes for skills are:

- Inexperienced (+0 or not defined). This is the default for skills undefined.
- Novice (+2). A unit has a basic understanding of the skill
- Proficient (+4). A unit is able to perform the skill effectively.
- Adept (+6). A unit is well familiarised with the skill.
- Expert (+8). A unit has a thorough understanding of the skill.
- Master (+10). A unit has an exhaustive understanding of the skill and its intricacies.

The basic skills use aptitudes, but some special skills also use aptitudes. If special skills specify a check to an attribute, use its aptitude modifier when making that roll.

Weapons in this game belong to certain skill classes. These are classes of weapons that handle similarly. Following are all the weapon skill classes.

- One-Handed Striking (OHS). This includes swords, maces…
- Finesse Stabbing (Finesse). This includes rapiers, spears…
- Hooking. This includes axes, hooks…
- Two-Handed Striking (THS). This includes longswords, great axes, great maces…
- Polearm. This includes glaives, poleaxes, halberds…
- Contact. This includes unarmed attacks as well as brass knuckles, claws, daggers…
- Whips
- Thrown. This includes rocks, javelins, grenades…
- Bows.
- Firearm. This includes point-and-shoot weapons like the crossbow, battle rifles…
- Advanced Firearm. This includes firearms with technological capability such as missile launchers…
- Artillery. Usually static large guns like trebuchet, cannons, ballistae…
- Improvised. This includes items not designed to be weaponry like chairs, bottles…

Some weapons are used in a unique way. These belong to their own weapon skill class. The other basic skills follow.

- Interfacing. This is used when interfacing with technology and scenario objects.
- Agility. This is used when dodging/adjusting.
- Resolve. This is used when making pressure tests.
- Piloting. This is used when performing vehicle actions.
- Magic. Magic in this game encapsulates a large range of magic-like things.
### special skills
Special skills are skills with their own rules.
- Teleports. This unit does not provoke reactions while moving

## Magic

Magic comes in many forms in many universes. Psionics, prayer, and self-admitted magic. Even things like tech wizardry should be considered magic, unless tied to a specific item. Some magics are quite unique to their universe, for example the Elder Scroll’s Thu’um. For these more unique magics, they are often defined in the unit series’ special rules section.

Magic spells are usually an action. To cast a spell, the casting unit must succeed a magic skill check which is against their willpower. Harder spells will have modifiers to this roll. For aimed spells, their magic skill check is instead made against their motoric skill, adding their magic aptitude as a modifier. A units profile will say what magic spells they can use.
### [Type] Bolt
This is an aimed spell with a weapon profile. Cost: 42pt

| Name        | Range | Damage    | Attacks  | Skill Class | Special rules |
| ----------- | ----- | --------- | -------- | ----------- | ------------- |
| [Type] Bolt | SR    | [Type] 14 | Standard | Magic       |               |

### [Type] Blast

This is an aimed spell with a weapon profile. Cost: 45pt

| Name         | Range | Damage    | Attacks  | Skill Class | Special rules  |
| ------------ | ----- | --------- | -------- | ----------- | -------------- |
| [Type] Blast | SR    | [Type] 20 | Manual 1 | Magic       | Explosive (3”) |

### [Type] Beam
This is an aimed spell with a weapon profile. Cost: 28pt

| Name        | Range | Damage    | Attacks  | Skill Class | Special rules |
| ----------- | ----- | --------- | -------- | ----------- | ------------- |
| [Type] Beam | MR    | [Type] 18 | Manual 1 | Firearm     |               |

### Heal
This is a reaction spell. If another unit loses one structure within this unit’s zone of control, the unit may make a reaction and attempt to heal that lost structure. Make a magic skill check. If it succeeds, the target unit does not lose one structure.
# Unit Creation
As a universal wargaming system, Allesfezs Ekarschubi doesn’t come with many inbuilt unit types, and players are expected to create units themselves. Each unit has a unit cost. There is a section dedicated to costs. This section’s purpose is to outline the guidelines of unit creation, and help players determine what their attributes, skills, and items should be.

In Allesfezs Ekarshubi, attributes represent how capable the unit is in all regards of the attribute. The focus on gaining skills is instead on aptitudes. Here are the general guidelines for assigning attributes.

- 16: Someone with this value performs poorly regarding this attribute.
- 15: This is the capability of someone who has some lacking in this attribute.
- 14: This is the default attribute value for a common human person. This is to say that a common person, when handling anything unfamiliar, would have a target value of 14 to beat.
- 13: This is the capability of someone who is naturally talented in this attribute’s regard, or who practices in this attribute’s domain some.
- 12: Someone with this value in an attribute has a solid level of capability in all its aspects and can comfortably handle unfamiliar tasks.
- 11: Someone with this value possesses notably well capabilities and performs well in competitive scenarios in relation to this attribute that they are unfamiliar with.
- 10: This would mean a person possesses impressive capabilities in the domain of this attribute, exceling in tasks relating to the attribute.
- 9: This would mean a person is exceptionally well trained and is dedicated to performing the core aspects of this attribute.

Consider how the levels of aptitude interact with the attributes. For example, consider a swordsman. They would have a 13 in their motoric skill, an 11 in their physique skill, and a 13 in their willpower skill. However, they would likely be proficient or adept in their weapon of choice, making the target value for their attacks a 9 or a 7. A modern special operative might have an 11 in their motoric skill and be an expert in firearms, meaning they would need a 3 to hit with their firearm. If they got somewhat familiar with a sword and gained novice aptitude, they would be able to perform equally to a medieval swordsman. Similarly, if a person with a normal human capability in motoric became proficient in the sword, they would still be beaten by the special operative who is a novice.

You need to think about what equipment a unit would have on their person during a combat scenario. Take these from the equipment lists and chuck them on your unit. Also think of your units aptitudes in the skills, particularly which weapons they have aptitude in. Then, consider which special skills your unit should have.

To do: specify how point costs works, maybe make a huge table of point costs as an addendum.
# Equipment
The soldier of antiquity and the modern army person may have similar attributes. What really distinguishes a unit’s era of combat is their equipment, especially their weapons and armours. Being a all-era game, weapons have been designed to act somewhat believably.
## Weapon Profiles
weapon has a set of attributes: range, damage, attacks, and special rules. Range is split into four categories, with modification. Modifications are specified in a weapon’s profile as a number of inches added to the standard range category. These categories follow.

- Close quarters (CQ). This standard range describes weapons that can only be used when in base-to-base combat, or 0” away.
- Short Range (SR). Short range weapons give a +2 bonus when the target is within 8” of them, no bonus up to 16”, and a -4 modifier for things up to 24” away, which is the furthest they can shoot.
	- Augmented Short Range (ASR) gives a specified bonus for targets within 8”, which is by default a +4.
- Medium Range (MR). Medium range weapons give a +2 modifier between 8” and 16”, a -2 from then up to 32”, and a -4 modifier up until 48” which is the furthest they can shoot.
	- Augmented Medium Range (AMR) removes the -2 modifier between 16” and 24”, and applies the specified modifier to the 8”-16” and 16”-24” range band.
- Long Range (LR). These weapons give a -2 modifier up to 8”, and a +2 modifier between 16” and 32”. They then get a -4 modifier from 48 up until 96”, which is the furthest they can shoot.
- Artillery Range (AR) cannot select targets within 8” of the weapon, and give a +2 modifier for targets between 16” and 32” away. Between 32” and 64”, there is a -2 modifier, and a -4 further up until 144” which is the furthest they can shoot.
	- Augmented Artillery Range (AAR) augments the artillery range to give a +2 modifier for every range band.

In this table, T stands for told.

| **Name** | **0-8** | **8-16** | **16-24** | **24-32** | **32-48** | **48-64** | **64-96** | **96-144** |
| -------- | ------- | -------- | --------- | --------- | --------- | --------- | --------- | ---------- |
| **SR**   | +2      | 0        | -2        | -         | -         | -         | -         | -          |
| **ASR**  | T (+4)  | 0        | -2        | -         | -         | -         | -         | -          |
| **MR**   | 0       | +2       | -2        | -2        | -4        | -         | -         | -          |
| **AMR**  | 0       | T        | T         | 0         | -4        | -         | -         | -          |
| **LR**   | -2      | 0        | +2        | +2        | 0         | -4        | -4        | -          |
| **AR**   | -       | 0        | +2        | +2        | -2        | -2        | -4        | -4         |
| **AAR**  | -       | +2       | +4        | +4        | 0         | 0         | -2        | -2         |

You may choose not to use range bands, which will remove both positive and negative modifiers from the game. If you do this, weapons still cannot fire beyond their maximum range as specified in the range bands.

Damage is sometimes weapon-specific, but certain damage types carry effects that interact with armour.

- Slash weapons deal their damage by cutting the target.
- Crush weapons deal damage by breaking things using often concentrated force.
- Pierce weapons cut holes in targets.
- Bullet weapons fire small projectiles at extreme speeds. Bullet damage type ignores three points of armour automatically.
- Armour Piercing (AP) weapons fire specialised projectiles designed to pierce tough armour, as well as special melee weapons that achieve the same thing. AP damage type ignores five points of armour automatically.
- Laser weapons use concentrated energy beams.
- Plasma weapons use superheated projectiles.

Attacks are similarly handled into classes.

- Standard. The amount of attacks you get is determined by your aptitude in the weapon’s skill class. You get as many attacks as your aptitude’s bonus number divided by two, with a minimum of 1.
- Quick. The amount of attacks you get is twice the amount of attacks you get with the standard attack class.
- Manual. These weapons have as many attacks as specified with the number next to them. Manual weapons are always ammo weapons.
- Burst. The number of attacks you get is specified. You cannot split your attacks between different targets.
- Automatic. The number of attacks you get is specified.

### Weapon Profile Table

The first weapon profile here is the unarmed strike. All units have access to this, and it is not specified in equipment. **The unarmed strike deals 20-PHY crush damage**, where phy is the unit’s physique score.

**EXPLANATION:** The shotgun has 5 damage, which doesn’t have its own points cost thingy. Following the pattern, 5 damage should cost -6 points but I cant have negative costs for things like that. The Shotgun is a specially engineered gun to be just as effective as the Repeater in its own range band, so I’ve done the cost as if 5 damage costs nothing. Any new weapons cant do this.

| Name                      | Range    | Damage    | Attacks  | Skill Class | Special rules                            |
| ------------------------- | -------- | --------- | -------- | ----------- | ---------------------------------------- |
| Unarmed Strike            | CQ       | *         | Standard | Contact     | *Deals 20-PHY crush damage               |
|                           |          |           |          |             |                                          |
| Ancient                   |          |           |          |             |                                          |
| Club (1pt)                | CQ       | Crush 8   | Standard | OHS         |                                          |
| Pointy Stick (1pt)        | CQ       | Pierce 8  | Standard | THS         |                                          |
| Javelin (4pt)             | CQ       | Pierce 10 | Standard | Thrown      | Thrown                                   |
|                           |          |           |          |             |                                          |
| Medieval                  |          |           |          |             |                                          |
| Sword (8pt)               | CQ       | Slash 12  | Standard | OHS         |                                          |
| Longsword (12pt)          | CQ       | Slash 14  | Standard | THS         | Two-Handed                               |
| Spear (8pt)               | CQ       | Pierce 12 | Standard | Finesse     |                                          |
|                           |          |           |          |             |                                          |
| Bow (17pt)                | MR       | Pierce 12 | Manual 1 | Bows        | Ammo (1)                                 |
|                           |          |           |          |             |                                          |
| Chivalric                 |          |           |          |             |                                          |
| Poleaxe (15pt)            | CQ       | S/C/P 14  | Standard | THS         | Two-Handed, options                      |
|                           |          |           |          |             |                                          |
| Renaissance               |          |           |          |             |                                          |
| Musket (29pt)             | MR       | Bullet 15 | Manual 1 | Firearm     | Ammo (1), Long reload, Bayonet           |
| Flintlock Pistol (20pt)   | SR       | Bullet 14 | Manual 1 | Firearm     | Ammo (1), Long reload                    |
|                           |          |           |          |             |                                          |
| Industrial                |          |           |          |             |                                          |
| Bolt-Action Rifle (39pt)  | MR       | Bullet 18 | Manual 1 | Firearm     | Ammo (1), Bayonet                        |
| Repeater (62pt)           | MR       | Bullet 16 | Manual 2 | Firearm     | Ammo (8)                                 |
| Shotgun (58pt)            | SR       | Bullet 5  | Burst 8  | Firearm     | Ammo (4)                                 |
| Revolver (33pt)           | SR       | Bullet 16 | Manual 1 | Firearm     | Ammo (6)                                 |
| Pistol (51pt)             | SR       | Bullet 15 | Manual 2 | Firearm     | Ammo (12)                                |
| Rifle (88pt)              | MR       | Bullet 18 | Standard | Firearm     | Ammo (8), Bayonet                        |
| Machine Gun (176pt)       | AMR (+2) | Bullet 18 | Quick    | Firearm     |                                          |
| SMG (74pt)                | SR       | Bullet 15 | Standard | Firearm     | Ammo (20)                                |
| Scoped Rifle (60pt)       | AMR (+2) | Bullet 17 | Manual 1 | Firearm     | Ammo (4), Accurate (+2), Aim             |
| Hand Grenade (8pt)        | -        | Pierce 16 | -        | Thrown      | Thrown, Explosive (4”)                   |
|                           |          |           |          |             |                                          |
| Early Tank Cannon (106pt) | AMR (+2) | AP 38     | Manual 1 | Firearm     | Ammo 1, Team Loaded, Explosive (4”), Aim |
|                           |          |           |          |             |                                          |
| Modern                    |          |           |          |             |                                          |
| Assault Rifle (116pt)     | AMR (+2) | Bullet 18 | Standard | Firearm     | Ammo (20)                                |
| Marksman Rifle (121pt)    | LR       | Bullet 18 | Standard | Firearm     | Ammo (20)                                |
| PDW (101pt)               | SR       | Bullet 15 | Quick    | Firearm     |                                          |
| Sniper Rifle (83pt)       | LR       | Bullet 22 | Manual 1 | Firearm     | Ammo (5), Accurate (+4), Overwatch, Aim. |
| Frag Grenade (11pt)       | -        | Pierce 20 | -        | Thrown      | Thrown, Explosive (6”)                   |


### Special rules

As seen on the weapons table, here are the rules that each weapon may include in their profile. When the cost incorporates told, it is the number next to the rule in the weapon profile.

- Thrown. This weapon can be thrown. If this weapon’s profile has CQ range, it can also be used normally. When thrown, this weapon’s range is SR, and has Manual 1 attacks. Resolve the thrown ranged attack. This instance of the weapon cannot be thrown again. Weapons that are thrown do not factor in the SR range band when calculating cost. Weapons with thrown and explosive can target a random point on the battlefield. If this weapon cannot be used as a normal weapon, then its point cost is 1/4 the normal calculation.
- Ammo. This weapon uses ammunition. The number given is the number of attacks you can make before having to take the reload action. Ranged weapons without ammo might just have too many shots to need to count. Cost: told.
- X-Handed. Often two handed, this special rule determines how many hands must be used to wield this weapon. Cost: None.
- Options. If a weapon has options, there are many ways to deal damage with it. This is represented with slashes in the damage, where the first set of slashes defines what damage types it can deal, and the second set is the damage those types deal respectively. The damage types are abbreviated for brevity. S – Slash, C – Crush, P – Pierce, B – Bullet, L – Laser, Pl – Plasma. If there is only one damage number, this is the damage of all types. If there are several, then there is the same number as there are damage types and they can be mapped to the damage types respectively. Cost: 1 per option
- Bayonet. Weapons with bayonetted can be treated as a spear. Cost: +4
- Long reload. Weapons with long reload only half reload per reload action. You must use the reload action twice to reload these. Cost: -4
- Team Loaded. This weapon requires a team to load. If there is no specified number, this weapon requires two models to load. If a model is missing, then this weapon has the Long reload special rule. In vehicles, seats capable of loading these weapons are the main user of the weapon, and any seats with Loader. Cost: -3
- Accurate. These weapons are accurate to no fault if the user can wield them proficiently. Accurate weapons give a specified modifier to the hit rolls of attacks made with them if the user is proficient with weapons of this skill class. Cost: 5\*told
- Aim. These weapons benefit from taking the time to aim with them. If the user used the idle movement action this turn, any attacks made with this weapon gain a +2 modifier to hit. During reactive shoots, this weapon always gets a +2 modifier to hit. Cost: 6
- Explosive. These weapons explode. Any unit within the specified number of inches to the target are hit by this weapon, but the damage is halved for these secondary hits. Cost: 8+2\*told

Prehistoric

Ancient (500BCE-300CE)

Medieval (300-900)

Chivalric (900-1300)

Transitional (1300-1500)

Renaissance (1500-1750)

Industrial (1750-1950)

Modern (1950-2100)

Futuristic

## Armour

| Name                  | Armour Value             | Rules |
| --------------------- | ------------------------ | ----- |
| Leather Armour (6 pt) | 3                        |       |
| Metal Armour (11 pt)  | 5 / slash 7 / pierce 7   |       |
| Full Plate (15pt)     | 6 / slash 10 / pierce 10 |       |
| Anti-Bullet Shirt     | 0 /                      |       |
| Kevlar Vest (11pt)    | 4 / slash 6 / bullet 12  |       |

### Armour Value
For an armour to have resistances and weaknesses to damage types, it means that the armour value is different for those specified damage types. Resistances and weaknesses are specified by noting the damage type it is resistant to, as well as the new armour value, in the armour value section. On a unit’s profile, the abbreviations will probably be used alongside the armour value for that damage type.
## Other equipment
Shield. Shields provide a +4 bonus when blocking. To have a shield equipped, a unit must be able to realistically use it. For example, weapons that use two hands like longswords cannot use shields as well, as there is no hand for the shield.
# Vehicles
Vehicles when not piloted are treated as scenery with structure. This means you can still target them and damage them.

Vehicles have structure, armour, movement, and weaponry.

Vehicles are split into their different seats. There are a few common types of seat.

Models occupy seats, several units can occupy different seats of a vehicle.

The driver seat must be occupied to move the vehicle. If a unit has aptitude in pilot and is in the driver seat, you add the pilot modifier to the distance you move, in inches.

The gunner seat specifies which guns it makes available.

Vehicles have common attributes.

Clad means that the vehicle is hard to see out of. If a seat with the spotter attribute isn’t occupied, all actions targeting another unit have a -4 modifier to their skill check rolls.

Manual Loading attaches to specific weapons of the vehicle, usually tank guns. If a seat with the loader attribute isn’t occupied, weapons with manual loading have Long Reload

To pilot a vehicle, a unit makes the interface action targeting the vehicle.
### BT-7

| BT-7 (like 300pt or smthn)                                                       |            |     |
| -------------------------------------------------------------------------------- | ---------- | --- |
| STR                                                                              | ARM (83pt) | MOV |
| 5                                                                                | 20 / AP 14 | 10” |
| Seats: Driver, Gunner (Early tank cannon, Machine gun), Loader (Spotter, Loader) |            |     |
| Attributes: Clad                                                                 |            |     |
| Weapons: Machine Gun (170pt), Early tank cannon (106pt)                          |            |     |

# Actions
On your turn, you activate each of your units in an order of your choice. During a unit’s activation, you can either use a full action, or a movement action and a second action.
## Movement Actions
Movement actions can also be used during your second action.
### Move
Move the unit up to the distance specified in its Movement attribute. The unit must move in straight lines of 1” each. Any part of the base at the start of the movement must have line of sight to any part of the base at the end of the movement. You may only move vertically up to your unit’s height. Your second action and opposing reactions can be made at any point along your movement.
### Reload
Choose a weapon with an ammo count to reload. The weapon’s ammo count returns to the fully loaded number, as shown in the weapon profile.
### Idle
This unit does nothing. This still provokes reactions.
### Discover
Target a hidden unit in stealth within line of sight. Make a Perception (MOT) skill check face-to-face against a target’s Stealth (MOT) check. If the perception check succeeds, the target is no longer in stealth.
## Actions
These are regular actions you can take as your second action.
### Attack
Select a weapon to attack with. For each attack that weapon has, decide what other unit you are targeting. Targets must be within the range of the attack. If the target makes a dodge, block, or attack reaction, their roll is face-to-face with yours. Make a check with the weapon’s skill class. If you critically succeed, your attack deals 5 extra damage.

For every successful attack, the opponent must roll higher than the weapon’s damage minus their armour. If they fail this, they take a structure damage. Keep in mind the special effects of weapons, their ammo types, and their armour. Examples of this is the Elusive special skill, which increases the target value of an incoming attack.
### Interface
Interact with a scenario object. What this does will be defined in the scenario object’s description.
### Dodge/Adjust
Move the unit a distance equal to half your movement attribute, rounding down. If other models made an attack against this unit, make an Agility (PHY) skill check face-to-face with the incoming attack.
### Block
Select a weapon to block with. The weapon must have a compatible block type with the incoming attack. Make a face-to-face roll against an incoming attack, rolling with two dice.
## Reactions
When another unit provokes a reaction, you may use one of these actions provided the unit making them hasn’t already used all of their reactions.
### Attack
Select a weapon to make the reaction attack. You make one attack with that weapon against the unit that provoked the reaction. This is done face-to-face with that unit if it made the dodge/adjust action, attack action, block action, or any action that makes face-to-face rolls. The rest of this attack is handled identically to the regular attack action.
### Discover
This acts identically to the Movement Action discover.
### Dodge/Adjust
This acts identically to the action Dodge/Adjust.
### Block
This acts identically to the action Block.
# Points Cost
In Allesfezs Ekarschubi, unit’s point cost is calculated as a sum of their attributes and skills and their equipment. This system should in theory balance every unit out and their points cost, leaving the balance of the game up to strategy and outside factors. Changing the points cost of Allesfezs is one of the main common changes that should happen to control how powerful certain options are. When creating your own unit profile, you should add what your model should have rather than whatever you want.
This section consists of tables, and many of them. In the future, there will be an assisted way to calculate these points cost.
## Unit Card
The unit card has many costs involved. These are Attributes and Skills. These have a cost to move from one to the other, meaning that the cost of an actual level is the cumulative cost of the skill. For attributes, the minimum a unit can have is 17, and the highest is 9.


| **Score** | **Cost** | **cumulative cost** |
| --------- | -------- | ------------------- |
| **17**    | 0        | 0                   |
| **16**    | 1        | 1                   |
| **15**    | 1        | 2                   |
| **14**    | 2        | 4                   |
| **13**    | 4        | 8                   |
| **12**    | 8        | 16                  |
| **11**    | 14       | 30                  |
| **10**    | 20       | 50                  |
| **9**     | 30       | 80                  |

Skills have a minimum related attribute. To advance from one to the other, you need to have this score in its related attribute.


| **Aptitude** | **Cost** | **Cumulative COst** | **Min attribute** |
| ------------ | -------- | ------------------- | ----------------- |
| **+0**       | 0        | 0                   | n/a               |
| **+2**       | 4        | 4                   | 14                |
| **+4**       | 6        | 10                  | 13                |
| **+6**       | 8        | 18                  | 13                |
| **+8**       | 12       | 30                  | 12                |
| **+10**      | 15       | 45                  | 12                |

## Weaponry
Weaponry’s calculated cost is here in case you want to make your own weaponry. I will provide the cost of the game’s inbuilt weaponry in this rulebook.

The cost of weaponry is evaluated left to right. You multiply the range + damage cost by the attacks, then you add special rules. Weapons are fixed, so their cost is just the number, no cumulation. Damage is a flat cost. Some damage types have an additional cost added to this value before multiplication. Range is also a flat cost, also multiplied by the attacks. Skill class has no cost. The special rules of weapons have a cost later defined. Close Quarters range costs noting.

| **Damage Type** | **Cost** |
| --------------- | -------- |
| **Slash**       | 0        |
| **crush**       | 0        |
| **pierce**      | 0        |
| **bullet**      | 6        |
| **AP**          | 10       |
| **Laser**       | 8        |
| **Plasma**      | 12       |

| **Range**   | **Cost** |
| ----------- | -------- |
| **SR**      | 5        |
| **ASR**     | 10       |
| **MR**      | 8        |
| **AMR (T)** | 14+T     |
| **LR**      | 18       |
| **AR**      | 22       |
| **AAR**     | 30       |


| **Damage** | **Cost** |
| ---------- | -------- |
| **8**      | 1        |
| **9**      | 2        |
| **10**     | 4        |
| **11**     | 6        |
| **12**     | 8        |
| **13**     | 10       |
| **14**     | 12       |
| **15**     | 14       |
| **16**     | 16       |
| **17**     | 18       |
| **18**     | 20       |

| **Attacks**     | **Cost**                   |
| --------------- | -------------------------- |
| **Standard**    | *1 for CQ, *2.5 for ranged |
| **Quick**       | *2 for CQ, *5 for ranged   |
| **Manual N**    | *N                         |
| **Burst N**     | *N                         |
| **Automatic N** | *N                         |

## Armour Costs
I cannot think of a good way of point costing armour, so if you want to make other armours just feel for it, I’m sure it’ll be okay. Or, you could just not make that armour type. Heres a table that kinda works. A lot of the armours I designed are not fully optimised for these costs, so don’t you dare make slightly more optimised armours. Importantly, if you’re using this system, you should probably have all of 5 before moving on to 6+.

|   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|
|**Point**|**Slash**|**Crush**|**Pierce**|**Bullet**|**AP**|**Laser**|**Plasma**|**Total**|
|**0-5**|1/6|1/6|1/6|1/6|1|1/6|1/6|2 (10)|
|**6-10**|0.25|0.25|0.25|0.25|1|0.5|0.5|3 (35)|
|**11-15**|0.5|0.5|0.5|0.5|2|0.5|0.5|5 (60)|
|**16-20**|0.75|0.75|0.75|0.75|2|1|1|7 (95)|
|**20-30**|1|1|1|1|3|1|1|9 (140)|
|**30+**|1.25|1.25|1.25|1.25|3|1.5|1.5|11|