package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.WalletMoney: ImageVector
    get() {
        if (_WalletMoney != null) {
            return _WalletMoney!!
        }
        _WalletMoney = ImageVector.Builder(
            name = "WalletMoney",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.97f, 16.08f)
                curveTo(20.73f, 18.75f, 18.8f, 20.5f, 16f, 20.5f)
                horizontalLineTo(7f)
                curveTo(4.24f, 20.5f, 2f, 18.26f, 2f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2f, 5.78f, 3.64f, 3.88f, 6.19f, 3.56f)
                curveTo(6.45f, 3.52f, 6.72f, 3.5f, 7f, 3.5f)
                horizontalLineTo(16f)
                curveTo(16.26f, 3.5f, 16.51f, 3.51f, 16.75f, 3.55f)
                curveTo(19.14f, 3.83f, 20.76f, 5.5f, 20.97f, 7.92f)
                curveTo(21f, 8.21f, 20.76f, 8.45f, 20.47f, 8.45f)
                horizontalLineTo(18.92f)
                curveTo(17.96f, 8.45f, 17.07f, 8.82f, 16.43f, 9.48f)
                curveTo(15.67f, 10.22f, 15.29f, 11.26f, 15.38f, 12.3f)
                curveTo(15.54f, 14.12f, 17.14f, 15.55f, 19.04f, 15.55f)
                horizontalLineTo(20.47f)
                curveTo(20.76f, 15.55f, 21f, 15.79f, 20.97f, 16.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 10.969f)
                verticalLineTo(13.029f)
                curveTo(22f, 13.579f, 21.56f, 14.029f, 21f, 14.049f)
                horizontalLineTo(19.04f)
                curveTo(17.96f, 14.049f, 16.97f, 13.259f, 16.88f, 12.179f)
                curveTo(16.82f, 11.549f, 17.06f, 10.959f, 17.48f, 10.549f)
                curveTo(17.85f, 10.169f, 18.36f, 9.949f, 18.92f, 9.949f)
                horizontalLineTo(21f)
                curveTo(21.56f, 9.969f, 22f, 10.419f, 22f, 10.969f)
                close()
            }
        }.build()

        return _WalletMoney!!
    }

@Suppress("ObjectPropertyName")
private var _WalletMoney: ImageVector? = null
