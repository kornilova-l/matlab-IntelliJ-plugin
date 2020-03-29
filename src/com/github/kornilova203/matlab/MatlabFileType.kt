package com.github.kornilova203.matlab

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class MatlabFileType private constructor() : LanguageFileType(MatlabLanguage.INSTANCE) {

    companion object {
        @JvmField
        val INSTANCE = MatlabFileType()
    }

    override fun getIcon(): Icon? {
        return Icons.Matlab
    }

    override fun getName(): String {
        return "Matlab"
    }

    override fun getDefaultExtension(): String {
        return "m"
    }

    override fun getDescription(): String {
        return "Matlab language file"
    }

}