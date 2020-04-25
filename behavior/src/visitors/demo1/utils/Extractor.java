package visitors.demo1.utils;

import visitors.demo1.Visitor;
import visitors.demo1.impl.PPTFile;
import visitors.demo1.impl.PdfFile;
import visitors.demo1.impl.WordFile;

/**
 * 提取器
 *
 * @author zhoude
 * @date 2020/4/25 12:00
 */
public class Extractor implements Visitor {
    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("extract ppt.");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("extract pdf.");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("extract word.");
    }
}
