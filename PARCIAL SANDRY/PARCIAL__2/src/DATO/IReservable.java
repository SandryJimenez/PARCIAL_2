
package DATO;
import MOTORR.Motor;

public interface IReservable {
    boolean alquilarMotor(Motor m);
    Motor reservarMotor(Motor m);
    
    int getTotalMotorReservado();
    int getTotalMotorAlquilado();

}
