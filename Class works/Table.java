import java.util.ArrayList;
import java.util.List;

class TableRow {
    private String n;
    private String nsq;
    private String nsqRoot;
    private String nCube;
    private String nCubeRoot;

    public TableRow(String n, String nsq, String nsqRoot, String nCube, String nCubeRoot) {
        this.n = n;
        this.nsq = nsq;
        this.nsqRoot = nsqRoot;
        this.nCube = nCube;
        this.nCubeRoot = nCubeRoot;
    }

    public String getN() {
        return n;
    }

    public String getNsq() {
        return nsq;
    }

    public String getNsqRoot() {
        return nsqRoot;
    }

    public String getNCube() {
        return nCube;
    }

    public String getNCubeRoot() {
        return nCubeRoot;
    }
}

public class Table {
    private List<String> headers;
    private List<TableRow> rows;

    public Table(String[] headers) {
        this.headers = new ArrayList<>();
        for (String header : headers) {
            this.headers.add(header);
        }
        this.rows = new ArrayList<>();
    }

    public void addRow(TableRow row) {
        this.rows.add(row);
    }

    public void printTable() {
        // Print headers
        for (String header : headers) {
            System.out.printf("%-10s ", header);
        }
        System.out.println();

        // Print table data
        for (TableRow row : rows) {
            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n",
                    row.getN(), row.getNsq(), row.getNsqRoot(), row.getNCube(), row.getNCubeRoot());
        }
    }

    public static void main(String[] args) {
        String[] headers = {"N", "Nsq", "NSqRoot", "NCube", "NCubeRoot"};
        Table table = new Table(headers);

        table.addRow(new TableRow("1", "1", "1.00", "1", "1.00"));
        table.addRow(new TableRow("2", "4", "1.41", "8", "1.26"));
        table.addRow(new TableRow("3", "9", "1.73", "27", "1.44"));
        table.addRow(new TableRow("4", "16", "2.00", "64", "1.59"));
        table.addRow(new TableRow("5", "25", "2.24", "125", "1.71"));

        table.printTable();
    }
}


