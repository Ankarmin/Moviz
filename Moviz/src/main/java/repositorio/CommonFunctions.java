package repositorio;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CommonFunctions {

	public static <T extends Entidades> void llenarTabla(JTable tabla, List<String> columnas, List<T> datos) {
		@SuppressWarnings("serial")
		DefaultTableModel model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		int row = 0;
		int column = 0;
		for (String columna : columnas) {
			model.addColumn(columna);
			model.isCellEditable(row, column);
			column++;
		}

		for (T dato : datos) {
			model.addRow(dato.toArray());
			for (int i = 0; i < columnas.size(); i++) {
				model.isCellEditable(row, i);
			}
			row++;
		}

		tabla.setModel(model);

	}
}
