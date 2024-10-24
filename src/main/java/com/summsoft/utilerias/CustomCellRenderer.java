package com.summsoft.utilerias;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Llama al renderizador predeterminado para configurar el componente
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Asegura que el componente sea opaco
        setOpaque(true);

        // Verifica si el valor de la celda es 25
        if (value != null && value.equals(25)) {
            // Cambia la fuente a negrita y un tamaño mayor para resaltar
            cellComponent.setFont(cellComponent.getFont().deriveFont(Font.BOLD, 16f));
        } else {
            // Restablece la fuente predeterminada para las otras celdas
            cellComponent.setFont(cellComponent.getFont().deriveFont(Font.PLAIN, 12f));
        }

        // Si está seleccionada, mantenemos el color de selección de FlatLaf
        if (isSelected) {
            cellComponent.setBackground(table.getSelectionBackground());
        } else {
            // Restaura el color de fondo predeterminado
            cellComponent.setBackground(java.awt.Color.WHITE);
        }

        return cellComponent;
    }
}


