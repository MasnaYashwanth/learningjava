package Training;

class Developer extends Employee
{
     int hra, ta;
     Developer()
     {
          super();
          hra = ta = 0;
     }
     Developer(String n, int sal, int h, int t)
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