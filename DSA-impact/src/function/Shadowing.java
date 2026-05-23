package function;

public class Shadowing {

//    Variable Shadowing in Java
//
//    Variable shadowing happens when a local variable and an instance variable have the same name.
//
//    The local variable hides (shadows) the instance variable inside that scope.


        int marks = 90; // instance variable

        void display() {

            int marks = 50; // local variable shadows instance variable

            System.out.println(marks);       // local variable
            System.out.println(this.marks);  // instance variable
        }

        public static void main(String[] args) {

            Shadowing s1 = new Shadowing();

            s1.display();
        }
    }




