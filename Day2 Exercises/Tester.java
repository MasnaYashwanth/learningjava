package Training;

class Tester extends Employee
{
     int hra, ta;
     Tester()
     {
          super();
          hra = ta = 0;
     }
     Tester(String n, int sal, int h, int t)
     {
          super(n, sal);
          hra = h;
          ta = t;
     }
     int getSalary()
     {
          return (super.getSalary()+hra+ta);
     }
}