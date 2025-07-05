//🔹 1. equals() method:
//Kya karta hai: Ye check karta hai ki do objects equal hain ya nahi.
//Use kab karte hain: Jab aapko do objects ke content compare karne hain.

//Example:
//String s1 = new String("Akanksha");
//String s2 = new String("Akanksha");
//System.out.println(s1.equals(s2)); // true, kyunki content same hai

// 🔹 2. hashCode() method:
//Kya karta hai: Ye object ka unique integer number (hash value) return karta hai.
//Use kab hota hai: Ye mainly HashMap, HashSet, Hashtable jaise collections mein use hota hai — jahan objects ko store karne ke liye buckets use hote hain.
//Same object agar equal hai, to hashCode bhi same hona chahiye — ye rule hai.

//🔁 Dono ka relation:
//Agar equals() true return karta hai, to hashCode() bhi same hona chahiye.
//Lekin agar hashCode() same hai, to equals() zaroori nahi true ho — kyunki hash collision ho sakta hai.

//🔁 Line 1:"Agar equals() true return karta hai, to hashCode() bhi same hona chahiye."

// Matlab:
//Agar do object ek jaise hain (equals ke hisaab se), to unka hashCode bhi same hona chahiye.

//✅ Example:
//String s1 = new String("Akanksha");
//String s2 = new String("Akanksha");
//System.out.println(s1.equals(s2));     // true
//System.out.println(s1.hashCode());     // same
//System.out.println(s2.hashCode());     // same
// 👉 Dono ka content same hai, isliye equals() true hai, aur hashCode() bhi same aaya — ✅ sahi behavior.

// 🔁 Line 2:"Lekin agar hashCode() same hai, to equals() zaroori nahi true ho — kyunki hash collision ho sakta hai."

//Matlab:
//Kabhi-kabhi do alag objects ka hashCode same aa sakta hai, lekin unka content alag ho (i.e. equals() false dega). Isko kehte hain hash collision.

//⚠️ Example:
//class Dummy {
//    int id;
//
//    Dummy(int id) {
//        this.id = id;
//    }
//
//    @Override
//    public int hashCode() {
//        return 1;  // Har object ka same hashcode de rahe hain (galti se)
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Dummy)) return false;
//        Dummy d = (Dummy) obj;
//        return this.id == d.id;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Dummy d1 = new Dummy(10);
//        Dummy d2 = new Dummy(20);
//
//        System.out.println(d1.hashCode());  // 1
//        System.out.println(d2.hashCode());  // 1
//
//        System.out.println(d1.equals(d2));  // false (id alag hai)
//    }
//}

//📌 Yahaan:
//d1 aur d2 ka hashCode() same hai (1), lekin
//equals() false de raha hai — kyunki id alag hai (10 vs 20).
//👉 Yehi hota hai hash collision: alag objects ka same hash code.

//🔚 Final line (yaad rakhne ke liye):
// ✅ equals() == true ➡️ hashCode() must be same
//⚠️ hashCode() same ➡️ equals() ho bhi sakta hai, nahi bhi


package in.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("ABC", 100, "1111");
        Person person2 = new Person("ABC", 100, "1111");
        if(person1.equals(person2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }

}
