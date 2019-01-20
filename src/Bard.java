
import java.util.ArrayList;

public class Bard extends Character {

    int splattack, splsave, splslots = 2;
    ArrayList<String> cantriplist;
    ArrayList<String> spelllist;

    public Bard(String n, String r) {
        super(n, r);
        splattack = getCha() + pb;
        splsave = 8 + pb + getCha();
    }

    @Override
    protected int hpget(int c) {
        int hp = 8;
        return hp + c;
    }


    protected int acget(char t, int d) {
        return 11 + d;
    }

    @Override
    protected void equipement(char a) {
        if (a == 'a') {
            String diplopack[] = {"Chest", "2 cases for maps and scrolls", "a set of Fine clothes", "Bottle of ink", "Lamp", "2 flasks of oil", "5 sheets of paper", "vial of Perfume", "Sealing wax", "Soap"};
            for (int i = 0; i < diplopack.length; i++) {
                addEquip(diplopack[i]);
            }
            addEquip("Lute");
        } else {
            String enterpack[] = {"Backpack", "Bedroll", "2 costumes", "5 candles", "5 days of Rations", "Waterskin", "Disguise kit"};
            for (int i = 0; i < enterpack.length; i++) {
                addEquip(enterpack[i]);
            }
            addEquip("Flute");
        }
    }

    @Override
    protected void attacks(int m, int p, char a) {
        int sum = m + p;
        if (a == 'a') {
            addAttack("Rapier " + sum + "\t1d6+ " + m);
            addAttack("Viscious Mockery "+"Wis save:"+splsave+"\t1d4+ "+splattack);
        } else {
            addAttack("Longsword " + sum + "\t1d10 " + m);
        }
    }

    @Override
    protected void abilities() {
        addAbility("Bardic Inspiration:You can use a bonus action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. That creature gains one Bardic Inspiration die, a d6.\n"
                + "\n"
                + "Once within the next 10 minutes, the creature can roll the die and add the number rolled to one ability check, attack roll, or saving throw it makes. The creature can wait until after it rolls the d20 before deciding to use the Bardic Inspiration die, but must decide before the DM says whether the roll succeeds or fails. Once the Bardic Inspiration die is rolled, it is lost. A creature can have only one Bardic Inspiration die at a time.\n"
                + "\n"
                + "You can use this feature a number of times equal to your Charisma modifier (a minimum of once). You regain any expended uses when you finish a long rest. Your Bardic Inspiration die changes when you reach certain levels in this class. The die becomes a d8 at 5th level, a d10 at 10th level, and a d12 at 15th level. ");
    }

    @Override
    protected int perception(int w) {
        int perc = 10;
        w = modgetter(getWis());
        return perc = 10 + w;
    }

    @Override
    protected int getmoney() {
        int money = 5 * (int) (Math.random() * 4 + 1) * 10;
        return money;
    }

    @Override
    protected void proficiencies() {
        addProf("Armor:Light Armor");
        addProf("Weapons: Simple weapons, hand crossbows, longswords, rapiers, shortswords");
        addProf("Tools:Lute,Flute, Drums");
    }

    public final void addCantrip(String can) {
        cantriplist.add(can);
    }

    public final ArrayList<String> getCantrip() {
        return cantriplist;
    }

    public final void addSpell(String spell) {
        spelllist.add(spell);
    }

    public final ArrayList<String> getSpell() {
        return spelllist;
    }

    public void Cantriplist(char a) {
        if (a == 'a') {
            addCantrip("Vicious Mockery:You unleash a string of insults laced with subtle enchantments at a creature you can see within range. If the target can hear you (though it need not understand you), it must succeed on a Wisdom saving throw or take 1d4 psychic damage and have disadvantage on the next attack roll it makes before the end of its next turn. \n"
                    + "This spell's damage increases by 1d4 when you reach 5th level (2d4), 11th level (3d4), and 17th level (4d4).");
            addCantrip("Dancing Lights:You create up to four torch-sized lights within range, making them appear as torches, lanterns, or glowing orbs that hover in the air for the duration. You can also combine the four lights into one glowing vaguely humanoid form of Medium size. Whichever form you choose, each light sheds dim light in a 10- foot radius. \n"
                    + "As a bonus action on your turn, you can move the lights up to 60 feet to a new spot within range. A light must be within 20 feet of another light created by this spell, and a light winks out if it exceeds the spell's range.");

        } else {
            addCantrip("True Strike: You extend your hand and point a finger at a target in range. Your magic grants you a brief insight into the target's defenses. On your next turn, you gain advantage on your first attack roll against the target, provided that this spell hasn't ended.");
            addCantrip("You point your finger toward a creature within range and whisper a message. The target (and only the target) hears the message and can reply in a whisper that only you can hear. \n"
                    + "You can cast this spell through solid objects if you are familiar with the target and know it is beyond the barrier. Magical silence, 1 foot of stone, 1 inch of common metal, a thin sheet of lead, or 3 feet of wood blocks the spell. The spell doesn't have to follow a straight line and can travel freely around corners or through openings.");

        }

    }

    public void Spellist(char a) {
if(a=='a'){
    addSpell("Healing Word(AKA best spell in the game):A creature of your choice that you can see within range regains hit points equal to 1d4 + your spellcasting ability modifier. This spell has no effect on undead or constructs. At Higher Levels. When you cast this spell using a spell slot of 2nd level or higher, the healing increases by 1d4 for each slot level above 1st.");
    addSpell("Hideous Laughter:A creature of your choice that you can see within range perceives everything as hilariously funny and falls into fits of laughter if this spell affects it. The target must succeed on a Wisdom saving throw or fall prone, becoming incapacitated and unable to stand up for the duration. A creature with an Intelligence score of 4 or less isn't affected. \n" +
"At the end of each of its turns, and each time it takes damage, the target can make another Wisdom saving throw. The target has advantage on the saving throw if it's triggered by damage. On a success, the spell ends.");
    
}
else{
    addSpell("Unseen Servant:This spell creates an invisible, mindless, shapeless force that performs simple tasks at your command until the spell ends. The servant springs into existence in an unoccupied space on the ground within range. It has AC 10, 1 hit point, and a Strength of 2, and it can't attack. If it drops to 0 hit points, the spell ends. \n" +
"Once on each of your turns as a bonus action, you can mentally command the servant to move up to 15 feet and interact with an object. The servant can perform simple tasks that a human servant could do, such as fetching things, cleaning, mending, folding clothes, lighting fires, serving food, and pouring wine. Once you give the command, the servant performs the task to the best of its ability until it completes the task, then waits for your next command. \n" +
"If you command the servant to perform a task that would move it more than 60 feet away from you, the spell ends.");
    addSpell("Heroism:A willing creature you touch is imbued with bravery. Until the spell ends, the creature is immune to being frightened and gains temporary hit points equal to your spellcasting ability modifier at the start of each of its turns. When the spell ends, the target loses any remaining temporary hit points from this spell.");
    
    }
    }
}
