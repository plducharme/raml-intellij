package com.hybris.intellij.raml;

import com.hybris.intellij.raml.highlighter.RamlEditorHighlighter;
import com.intellij.lang.Language;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.highlighter.EditorHighlighter;
import com.intellij.openapi.fileTypes.EditorHighlighterProvider;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeEditorHighlighterProviders;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * User: plducharme
 * Date: 05/02/14
 * Time: 11:47 AM
 * Description:
 */
public class RamlFileType extends LanguageFileType{

    public static final RamlFileType RAML_FILE_TYPE = new RamlFileType();
    public static final String DEFAULT_EXTENSION = "raml";
    public static final Language RAML_LANGUAGE = RAML_FILE_TYPE.getLanguage();

    protected RamlFileType() {
        super(new RamlLanguage());
        FileTypeEditorHighlighterProviders.INSTANCE.addExplicitExtension(this, new EditorHighlighterProvider() {
            @Override
            public EditorHighlighter getEditorHighlighter(@Nullable Project project,
                                                          @NotNull FileType fileType, @Nullable VirtualFile virtualFile,
                                                          @NotNull EditorColorsScheme colors) {
                return new RamlEditorHighlighter(colors);
            }
        });
    }

    @NotNull
    @Override
    public String getName() {
        return "raml";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "raml files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        //TODO
        return null;
    }
}
