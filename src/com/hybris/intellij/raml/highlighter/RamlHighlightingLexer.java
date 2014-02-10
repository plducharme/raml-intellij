package com.hybris.intellij.raml.highlighter;

import com.hybris.intellij.raml.lexer.RamlLexer;
import com.intellij.lexer.LayeredLexer;
import com.intellij.lexer.Lexer;

/**
 * User: plducharme
 * Date: 06/02/14
 * Time: 2:28 PM
 * Description:
 */
public class RamlHighlightingLexer extends LayeredLexer{
    public RamlHighlightingLexer() {
        super(new RamlLexer());
    }
}
