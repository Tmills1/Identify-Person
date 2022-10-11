package Practice;

public class Person {
        private String name,gender,SSN,birthday;
        private double height,weight;
        public Person(String name, String gender, String sSN, String birthday, double height, double weight) {
                super();
                this.name = name;
                this.gender = gender;
                SSN = sSN;
                this.birthday = birthday;
                this.height = height;
                this.weight = weight;
        }
        
        
        
        public void setName(String name) {
                this.name = name;
        }



        public void setWeight(double weight) {
                this.weight = weight;
        }
        
        public void printRecursive(String str) {
                if(str.length() == 0) {
                        return ;
                }
                
                System.out.print(str.charAt(0)+".");
                printRecursive(str.substring(1));
                System.out.print(str.charAt(0)+".");
        }
        public String getSSN() {
                return SSN;
        }

        public String getName() {
                return name;
        }

        public void printDetails() {
                System.out.println("\nName: "+this.name);
                System.out.println("Birthday: "+this.birthday);
        }

        @Override
        public String toString() {
                return "Person \n[name=" + name + "\ngender=" + gender + "\nSSN=" + SSN + "\nbirthday=" + birthday + "\nheight="
                                + height + "\nweight=" + weight + "]";
        }
        
}
class main {
        public static void main(String[] args) {
                Person obj1=new Person("Barry Allen","Male","123-55-7612","7/31/1986",5.6,50.5);
                obj1.printRecursive(obj1.getName());
                System.out.println();
                obj1.printRecursive(obj1.getSSN());
                
                obj1.setName("Barry Allen");
                System.out.println();
                obj1.printRecursive(obj1.getName());
                obj1.printDetails();
                System.out.println();
                System.out.println(obj1);
        }
        
}