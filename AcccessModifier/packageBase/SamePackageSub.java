package packageBase;

public class SamePackageSub {

    Base base = new Base();

    // public
    int result_addition = base.addition(2, 2);
    // private
    int result_substraction = base.substraction(2, 2);
    // protected
    int result_multiplication = base.multiplycation(2, 2);
    // default
    int result_division = base.division(2, 2);
}

class SubIn extends Base {
    // public
    int result_addition = addition(2, 2);
    // private
    int result_substraction = substraction(2, 2);
    // protected
    int result_multiplication = multiplycation(2, 2);
    // default
    int result_division = division(2, 2);

}
