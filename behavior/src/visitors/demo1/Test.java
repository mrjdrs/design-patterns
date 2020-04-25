package visitors.demo1;

import visitors.demo1.impl.PPTFile;
import visitors.demo1.impl.PdfFile;
import visitors.demo1.impl.WordFile;
import visitors.demo1.utils.Compressor;
import visitors.demo1.utils.Extractor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoude
 * @date 2020/4/25 11:56
 */
public class Test {
    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listAllResourceFiles("");

        Extractor extractor = new Extractor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
        }

        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}
