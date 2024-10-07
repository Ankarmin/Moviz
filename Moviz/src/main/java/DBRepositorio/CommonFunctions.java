package DBRepositorio;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//ESTA CLASE ES PARA GENERAR TABLAS ADAPTABLES A CUALQUIER TIPO DE ENTIDAD
//ESTA CLASE EN PARTICULAR ESTA DESTINADA A SERVIR COMO UN ALOJADOR DE FUNCIONES
//QUE SE VAN A COMPARTIR ENTRE TODOS LOS CONTROLADORES
public class CommonFunctions {

	// STATIC:
	// UN MÉTODO ESTÁTICO FUNCIONA COMO UNA FUNCIÓN QUE PUEDE
	// SER LLAMADA SIN LA NECESIDAD DE
	// INSTANCIAR A LA CLASE QUE LA CONTIENE. EN ESTE CASO, LA FUNCIÓN LLENARTABLA
	// PUEDE SER INVOCADA DE LA SIGUIENTE MANERA
	// CommonFunctions.llenarTabla(args...)

	// <T extends Entidades> y List<T>
	// "T" REPRESENTA UN TIPO DE DATOS QUE AUN NO HA SIDO DEFINIDO
	// POR EJEMPLO: T PUEDE SER A CONVENIENCIA UN STRING, INT, DOUBLE, FLOAT,
	// ETC....
	// extends Entidades
	// EN EL PAQUETE DBREPOSITORIO SE ENCUENTRA UNA CLASE LLAMADA "ENTIDADES", SI
	// REVISAS BIEN A LAS ENTIDADES
	// VERAS ESTO: public class Libro extends Entidades, POR EJEMPLO
	// EXTENDS ES UNA PALABRA CLAVE DE JAVA QUE INDICA HERENCIA ENTRE CLASES, EN
	// PALABRAS SIMPLES, LO QUE TENGA ENTIDADES LO TIENE LA
	// CLASE QUE HEREDA DE ELLA
	// NO VOY A AHONDAR EN LO QUE ES UNA CLASE ABSTRACTA PERO EN ESTE CASO EN
	// PARTICULAR CUANDO VEMOS <T extends Entidades> NOS REFERIMOS
	// A QUE T SOLO PUEDE SER CUALQUIER TIPO DE DATO QUE HEREDE DE LA CLASE
	// "ENTIDADES" POR LO QUE SU CONJUNTO DE VALORES SE VE
	// LIMITADO A LAS ENTIDADES YA MENCIONADAS
	// SI T TOMA ALGUN VALOR, LIST<T> TAMBIEN LO TOMA, EJEMPLO: T = Libro ->
	// List<Libro>
	// ANALIZANDO ESTE MÉTODO, ES UN MÉTODO PUBLICO Y ESTÁTICO, QUE UTILIZA UN
	// GENERICO QUE SOLO PUEDE TOMAR EL VALOR DE ALGUNA ENTIDAD
	// Y NO DEVUELVE NADA (VOID)
	// Args: TABLA->LA TABLA QUE SERA LLENADA, COLUMNAS->LA LISTA DE COLUMNAS QUE
	// TENDRA LA TABLA, DATOS->LOS DATOS QUE SE CARGARAN EN LA TABLA
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
