package visitors.demo1.utils;

import visitors.demo1.Visitor;
import visitors.demo1.impl.PPTFile;
import visitors.demo1.impl.PdfFile;
import visitors.demo1.impl.WordFile;

/**
 * 压缩机
 *
 * @author zhoude
 * @date 2020/4/25 12:08
 */
public class Compressor implements Visitor {
    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("compress ppt.");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("compress pdf.");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("compress word.");
    }
}
