package Leksiya.less2.Ex006.Interface;

import Leksiya.less2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
