package ProjectManagement;

public class FactoryMethod {
    // Report.java
    public interface Report {
        void generate();
    }

    // ProgressReport.java
    public static class ProgressReport implements Report {
        @Override
        public void generate() {
            System.out.println("Generating Progress Report...");
        }
    }

    // TaskReport.java
    public static class TaskReport implements Report {
        @Override
        public void generate() {
            System.out.println("Generating Task Report...");
        }
    }

    // ReportFactory.java
    public abstract static class ReportFactory {
        public abstract Report createReport();
    }

    // ProgressReportFactory.java
    public static class ProgressReportFactory extends ReportFactory {
        @Override
        public Report createReport() {
            return new ProgressReport();
        }
    }

    // TaskReportFactory.java
    public static class TaskReportFactory extends ReportFactory {
        @Override
        public Report createReport() {
            return new TaskReport();
        }
    }
}
