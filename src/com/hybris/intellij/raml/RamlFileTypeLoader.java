package com.hybris.intellij.raml;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * User: plducharme
 * Date: 05/02/14
 * Time: 11:39 AM
 * Description:
 */
public class RamlFileTypeLoader extends FileTypeFactory{

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(RamlFileType.RAML_FILE_TYPE);
    }
}
