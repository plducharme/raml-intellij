package com.hybris.intellij.raml.lexer;

import com.hybris.intellij.raml.RamlFileType;
import com.intellij.psi.tree.IElementType;

/**
 * User: plducharme
 * Date: 06/02/14
 * Time: 3:49 PM
 * Description:
 */
public interface RamlDocTokenTypes {

    IElementType RDOC_VERSION_TOKEN = new IElementType("RDOC_VERSION_TOKEN", RamlFileType.RAML_LANGUAGE);
    IElementType RDOC_TITLE_TOKEN = new IElementType("RDOC_TITLE_TOKEN", RamlFileType.RAML_LANGUAGE);
    IElementType RDOC_TITLE_VALUE_TOKEN = new IElementType("RDOC_TITLE_VALUE_TOKEN", RamlFileType.RAML_LANGUAGE);

    IElementType RDOC_URL_PARAM_TOKEN = new IElementType("RDOC_URL_PARAM_TOKEN", RamlFileType.RAML_LANGUAGE);
    IElementType RDOC_URL_PATH_TOKEN = new IElementType("RDOC_URL_PATH_TOKEN", RamlFileType.RAML_LANGUAGE);

    IElementType RDOC_UNKNOWN_TOKEN = new IElementType("RDOC_UNKNOWN_TOKEN", RamlFileType.RAML_LANGUAGE);
}
