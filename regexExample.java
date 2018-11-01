import java.util.regex.Pattern;
import java.util.regex.Matcher;

class regexExample{
public static void main(String[] args){
String name="Areesha Fatima SiddiquiAreesha Fatima SiddiquiAreesha Fatima Siddiqui";

Pattern p=Pattern.compile("A(.*?)ui");
Matcher m=p.matcher(name);

while(m.find())
{

System.out.println(m.group(1));
}

}
}