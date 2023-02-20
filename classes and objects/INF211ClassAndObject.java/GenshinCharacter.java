public class GenshinCharacter {
    String element; 
    int constellations;
    String name;
    String[] ability = new String[4];

    void attack(){
        System.out.println(name + " attaaaaccckkk.");
    }
    
    void skip(){
        System.out.println("Change character " + name);
    }
    
    String castElementalSkill(String skill){
        return name + "is a "+ skill;
    }
    
    GenshinCharacter(){
        constellations = 1;
        ability[0] = "tackle";
    }
    
    GenshinCharacter(String name, String element){
        this.name = name;
        this.element = element;
        constellations = 1;
        ability[0] = "tackle";
    }

}
