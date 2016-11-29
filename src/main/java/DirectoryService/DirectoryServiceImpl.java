package DirectoryService;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: TaNik
 * Date: 28.11.16
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */
public class DirectoryServiceImpl implements DirectoryService {

    @Override
    public List<File> searchByName(final String name) {

        File file = new File(name);
        File[] arrayOfFiles = new File[0];

        if(file.isDirectory()){
          arrayOfFiles =  file.listFiles();
        }

        return Arrays.asList(arrayOfFiles);
          //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<File> searchByExtension(String extension) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Long getDirectorySize(File directory, boolean recursive) {
        if(!directory.exists()){
            return null;
        }
        if(directory.isDirectory()){
            File[] files = directory.listFiles();
            for (File file: files){
                if (file.isFile()){
                   return file.length();
                }
                else{
                    return null;
                }
            }

        }

        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void appendLinesToFile(File file, List<String> lines) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void zip(File fileToZip) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unZip(File fileToZip) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(File toDelete) {
        toDelete.delete();//To change body of implemented methods use File | Settings | File Templates.
    }
}
