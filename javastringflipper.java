 // first java progrm, its more of a test than a real program ;) 
public class javastringflipper {
    public static void main(String[] args) {

      String name = "Damian";


      char[] nameArray = new char[6];

      String[] imiona = new String[4];

      imiona[1] = "Damian";


      for (int i = 0; i < name.length(); i++) {
        nameArray[i] = name.charAt(name.length()-1-i);
        System.out.println(nameArray[i]);
      }
    }


}