package com.mocoding.richeditor.sample.common

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.outlined.FormatBold
import androidx.compose.material.icons.outlined.FormatItalic
import androidx.compose.material.icons.outlined.FormatStrikethrough
import androidx.compose.material.icons.outlined.FormatUnderlined
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.mocoding.richeditor.model.RichTextStyle
import com.mocoding.richeditor.model.RichTextValue

@Composable
fun RichTextStyleRow(
    modifier: Modifier = Modifier,
    value: RichTextValue,
    onValueChanged: (RichTextValue) -> Unit,
) {
    Row(
        modifier = modifier
    ) {
        RichTextStyleButton(
            style = RichTextStyle.Bold,
            value = value,
            onValueChanged = onValueChanged,
            icon = Icons.Outlined.FormatBold
        )

        RichTextStyleButton(
            style = RichTextStyle.Italic,
            value = value,
            onValueChanged = onValueChanged,
            icon = Icons.Outlined.FormatItalic
        )

        RichTextStyleButton(
            style = RichTextStyle.Underline,
            value = value,
            onValueChanged = onValueChanged,
            icon = Icons.Outlined.FormatUnderlined
        )

        RichTextStyleButton(
            style = RichTextStyle.Strikethrough,
            value = value,
            onValueChanged = onValueChanged,
            icon = Icons.Outlined.FormatStrikethrough
        )

        RichTextStyleButton(
            style = RichTextStyle.Red,
            value = value,
            onValueChanged = onValueChanged,
            icon = Icons.Filled.Circle,
            tint = Color.Red
        )
    }
}