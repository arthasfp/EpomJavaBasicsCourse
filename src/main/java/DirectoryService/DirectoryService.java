package DirectoryService;

import java.io.File;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: TaNik
 * Date: 28.11.16
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */
public interface DirectoryService {

    List<File> searchByName(String name);

    List<File> searchByExtension(String extension);

    Long getDirectorySize(File directory, boolean recursive);

    void appendLinesToFile(File file, List<String> lines);

    void zip(File fileToZip);

    void unZip(File fileToZip);

    void delete(File toDelete);
}