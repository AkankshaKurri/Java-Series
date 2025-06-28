//For comparison of strings use "equals()"

//jab hum
//String str1 = new String("abc");
//toh normal heap mei store hoga

//aur jab hum
//String str1 = "abc"
//toh heap mei -> string pool mei store hoga

//We need to avoid usage of concatenation(+) in strings.Because each concatenation creates a new String.

//Remember: Strings mei length method hota hai.
//It gives no of Characters in a string

//Remember:Strings are immutable.

//methods you can use in string
//indexOf()
//length()
//equals()
//compareTo()
//substring()

//Printf Specifier
//%s -> String of text
//%f -> Floating point value(float or double)
//%e -> exponential, scientific notation of a float or double
//%b -> boolean true or false value
//%c -> single character char
//%d -> Base 10 integer, such as Java int, long, short or byte
//%o -> octal number
//%x -> Hexadecimal number
//%% -> Percentage sign
//%n -> New line, aka carriage-return
//%tY -> Year to four digits
//%tT -> Time in format of HH:MM:SS(i.e. 21:46:30)

//print flag
//-  -> Aligns the formatted printf output to the left
//+ -> The output includes a negative or positive sign
//( -> Places negative numbers in parenthesis
//0 -> The formatted printf output is zero padded
//, -> The formatted output includes grouping separators
//<space> -> A blank space adds a minus sign for negative numbers and a leading space when positive

//Syntax:
// % [flags] [width] [.precision] specifier-character

//Example
//'%s' -> does Java to 'Java'
//'%15s' -> does Java to '          Java' (first spaces then data)
//'%-15s ' -> does Java to 'Java           ' (first data then spaces)
//'%-15S ' -> does Java to 'JAVA           '
//'%d' -> does 123456789 to '123456789'
//'%,15d' -> does 123456789 to '    123,456,789'
//'%+,15d' -> does 123456789 to '   +123,456,789'
//'%-+,15d' -> does 123456789 to '+123,456,789   '
//'%0,15d' -> does 123456789 to '0000123,456,789'

//Remember : For input of string use next()

public class StringFormat {
    public static void main(String[] args) {
        String name = "Akanksha";
        int marks= 100;
        System.out.printf("Hello %s , your marks are %d %n", name , marks);
        System.out.printf("%s %n", name);
        System.out.printf("%15s %n", name);
        System.out.printf("%-15s %n", name);
        System.out.printf("%-15S %n", name);
        System.out.printf("%d %n", 123456789);
        System.out.printf("%,15d %n", 123456789);
        System.out.printf("%+,15d %n", 123456789);
        System.out.printf("%-+,15d %n", 123456789);
        System.out.printf("%0,15d" , 123456789);
    }
}
