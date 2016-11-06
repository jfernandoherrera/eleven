package team;

public aspect TeamASP {
	pointcut agregarPC(String n) : execution(void

			AdminTeam.agregar(..)) && args (n);

			before(String n) : agregarPC(n){

			System.out.println("Chequeando que estes logueado");
			
			}
}
