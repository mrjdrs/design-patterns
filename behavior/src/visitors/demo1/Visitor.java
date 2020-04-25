package visitors.demo1;

import visitors.demo1.impl.PPTFile;
import visitors.demo1.impl.PdfFile;
import visitors.demo1.impl.WordFile;

/**
 * @author zhoude
 * @date 2020/4/25 12:14
 */
public interface Visitor {
    void visit(PPTFile pptFile);

    void visit(PdfFile pdfFile);

    void visit(WordFile wordFile);
}
