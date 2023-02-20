import java.util.Scanner;

public class INF221ClassAndObject {
    // POKEMON EXAMPLE - CLASSES AND OBJECT 
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        GenshinCharacter character1 = new GenshinCharacter();
        character1.name = "Zhongli";
        character1.constellations = 6;
        character1.element = "Geo";
        character1.ability[0] = "DPS";
        character1.ability[1] = "SUB-DPS";
        character1.ability[2] = "SHIELDER";
        character1.ability[3] = "HEALER";

        System.out.println("character [1] owned: " + character1.name);
        System.out.println("character[1] element: " + character1.element);
        System.out.println("character[1] constellations: " + character1.constellations);

        character1.attack();
        character1.skip();
        int randomInt = (int) (Math.random()*3);
        String skill = character1.castElementalSkill(character1.ability[randomInt]);
        System.out.println(skill);

        GenshinCharacter character2 = new GenshinCharacter ();
        character2.name = "Arataki Itto";
        System.out.println(character2.ability[0]);
        System.out.println(character2.constellations);
        character2.attack();

        GenshinCharacter character3 = new GenshinCharacter("Albedo" , "Geo");
        System.out.println(character3.name + " " + character3.element);
        System.out.println(character3.ability[0]);
        System.out.println(character3.constellations);
        System.out.println(character3.castElementalSkill(character3.ability[randomInt]));
        
        
        
        GenshinCharacter character4 = new GenshinCharacter();
        String name = sc.nextLine();
        int level = sc.nextInt();
        character4.name = name;
        character4.constellations = level;
        character4.attack();
        System.out.println(character4.castElementalSkill(character4.ability[randomInt]));
    }
}
