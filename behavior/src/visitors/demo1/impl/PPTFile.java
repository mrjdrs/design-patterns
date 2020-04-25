package visitors.demo1.impl;

import visitors.demo1.Visitor;
import visitors.demo1.utils.Compressor;
import visitors.demo1.utils.Extractor;
import visitors.demo1.ResourceFile;

/**
 * @author zhoude
 * @date 2020/4/25 11:53
 */
public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
