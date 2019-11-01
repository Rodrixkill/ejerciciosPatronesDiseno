package composite;

import java.util.ArrayList;

public class Composite extends Component {
	private int estimacion=0;
    private ArrayList<Component> list = new ArrayList<>();
    public Composite(String attribute){
        super(attribute);
    }

    @Override
    public void imprimir() {
        // some actions when we do iteration with list
        for (Component comp: list
             ) {
            comp.imprimir();
        }

    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).nombre());
    }

	@Override
	public int getPrice() {
		for (Component comp: list) {
			estimacion+=comp.getPrice();
	    }
		return estimacion;
	}

	public int getEstimacion() {
		this.getPrice();
		return estimacion;
	}
}
