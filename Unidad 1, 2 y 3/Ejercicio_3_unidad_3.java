public class Ejercicio_3_unidad_3 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.00);

        try {
            cuenta.retirar(1200.00);
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException("Error, fondos insuficientes para realizar la operación");
        }
        saldo -= monto;
    }
}

class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

