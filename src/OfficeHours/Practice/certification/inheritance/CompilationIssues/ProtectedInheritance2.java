package OfficeHours.Practice.certification.inheritance.CompilationIssues;

import OfficeHours.Practice.certification.inheritance.ProtectedInheritance;

public class ProtectedInheritance2 extends ProtectedInheritance {
    public static void main(String[] args) {
        ProtectedInheritance p = new ProtectedInheritance2();
        System.out.println(p.s);
        //System.out.println(p.r); can not access r since it is protected and object is not created in the subclass.

        ProtectedInheritance2 obj = new ProtectedInheritance2();
        System.out.println(obj.r);
    }

}
