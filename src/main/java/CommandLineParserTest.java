import org.apache.commons.cli.*;

public class CommandLineParserTest {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();

        options.addOption(Option.builder().longOpt("host")
                .desc("smtp server host")
                .hasArg()
                .build());

        options.addOption(Option.builder().longOpt("port")
                .desc("smtp server port")
                .hasArg()
                .build());

        options.addOption(Option.builder().longOpt("from")
                .desc("from address")
                .hasArg()
                .build());

        options.addOption(Option.builder().longOpt("to")
                .desc("to address")
                .hasArg()
                .build());

        CommandLineParser parser = new DefaultParser();

        CommandLine line = parser.parse(options, args);

        String host = line.getOptionValue("host");
        String port = line.getOptionValue("port");
        String from = line.getOptionValue("from");
        String to = line.getOptionValue("to");

        System.out.println(host);
        System.out.println(port);
        System.out.println(from);
        System.out.println(to);
    }
}
