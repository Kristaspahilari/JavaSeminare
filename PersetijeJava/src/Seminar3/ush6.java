import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ush6 {
    private static JLabel dateTimeLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Date/Time Format App");
        JPanel panel = new JPanel();

        // ComboBox for selecting date/time formats
        JComboBox<String> formatComboBox = new JComboBox<>(new String[]{
                "dd/MM/yyyy HH:mm:ss",
                "yyyy-MM-dd HH:mm:ss",
                "EEE, MMM d, ''yy h:mm a"
        });
        formatComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDateTimeLabel((String) formatComboBox.getSelectedItem());
            }
        });
        panel.add(formatComboBox);

        // Label for displaying current date/time
        dateTimeLabel = new JLabel();
        panel.add(dateTimeLabel);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Update label with current date/time based on initial format selection
        updateDateTimeLabel((String) formatComboBox.getSelectedItem());
    }

    private static void updateDateTimeLabel(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date currentDate = new Date();
        String formattedDateTime = sdf.format(currentDate);
        dateTimeLabel.setText(formattedDateTime);
    }
}
