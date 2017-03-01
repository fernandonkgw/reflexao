package br.com.fnkgw.reflexao;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class BuscaStringEmAtributo {

	public static List<String> getAtributosComString(Object o, String string){
		List<String> lista = new ArrayList<>();
		
		Class<?> c = o.getClass();
		for(Field f : c.getFields()) {
			try {
				Object value = f.get(o);
				if (value instanceof String && string.equals(value)) 
					lista.add(f.getName());
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
		
		return lista;
	}
		
}
