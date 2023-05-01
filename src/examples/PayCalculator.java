package examples;

/**
 *
 * @author Josh Archer
 * @version 1.0
 */
public class PayCalculator
{
    private static final int OVERTIME_THRESHOLD = 40;
    private double payAmount;
    private String EmployeeFullName;

    /**
     *
     * @param payAmount the amount of pay
     * @param EmployeeFullName the employee's name
     */
    public PayCalculator(double payAmount, String EmployeeFullName)
    {
        this.payAmount = payAmount;
        this.EmployeeFullName = EmployeeFullName;
    }

    /**
     *
     * @param salaried is the employee salaried?
     * @param hours the hours the employee worked
     * @return the pay value
     */
    public double calculatePay(boolean salaried, int hours)
    {
        if (salaried)
        {
            return payAmount;
        }
        else
        {
            double total = hours * payAmount;

            if (hours > OVERTIME_THRESHOLD)
            {
                total += hours * (0.5 * payAmount);
            }

            return total;
        }
    }

    /**
     * Prints out the employee's name
     */
    public void printEmployee()
    {
        System.out.println(EmployeeFullName);
    }

    @Override
    public String toString()
    {
        return "PayCalculator{" +
                "payAmount=" + payAmount +
                ", EmployeeFullName='" + EmployeeFullName + '\'' +
                '}';
    }
}