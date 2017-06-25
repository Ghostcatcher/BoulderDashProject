package model;

import java.io.IOException;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModel {
	
    /**
     * Instantiates a new model facade.
     */
	IMap map;
    public ModelFacade() throws IOException {
        super();
        this.map = new Map();
    }
	public IMap getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}



}
