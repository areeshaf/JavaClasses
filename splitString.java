import java.util.Arrays;

class splitString{
public static void main(String[] args){

String myString="abdcdefdgh";
String strArray[]=myString.split("d");
System.out.println(Arrays.toString(strArray));
}
}