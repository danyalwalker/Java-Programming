package OfficeHours.Practice.certification.lambda_practices;

public class CheckIfHopper implements CheckTrait{

    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
