package Practica1;

public class Show{
    private String title;
    private Suscriber[] viewers;
    private double income;

    public Show(String title, Suscriber[] viewers) {
        this.title = title;
        this.viewers = viewers;
        setIncome();
    }

    public String getTitle() {
        return this.title;
    }
    public Suscriber[] getViewers() {
        return this.viewers;
    }
    public double getIncome() {
    	return this.income;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setViewers(Suscriber[] viewers) {
        this.viewers = viewers;
        this.setIncome();
    }
    public void setIncome() {
    	double price = 0;
    	for (Suscriber viewer: viewers) {
    		price+=viewer.getCategory().getPrice(); 
    	}
    	this.income = price;
    }
    public void showViewers() {
    	int ctr = 1;
		for (Suscriber viewer: this.getViewers()) {
			System.out.printf("%d -> Nº abonado: %d; Nombre: %s; Edad: %d; Categoría: %c\n",ctr,viewer.getId(),viewer.getName(),viewer.getAge(),viewer.getCategory().getCategoryName());
			++ctr;
		}
    }
    public void showData() {
    	System.out.println("----------------------------");
		System.out.println("ESPECTÁCULO");
		System.out.println("----------------------------");
		System.out.printf("TÍTULO: %s\n",this.getTitle());
		System.out.println("ESPECTADORES:");
		this.showViewers();
		System.out.printf("RECAUDACIÓN: %.2f€\n", this.getIncome());
		System.out.println("----------------------------");
    }
}