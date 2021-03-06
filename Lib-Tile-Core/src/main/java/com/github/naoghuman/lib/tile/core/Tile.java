/*
 * Copyright (C) 2016 Naoghuman
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.naoghuman.lib.tile.core;

import java.util.Optional;

/**
 * A {@code Tile} is per definition a little transparent
 * {@link javafx.scene.image.Image} which overlay a background color or an
 * {@code Image} with the help of repetitions from the {@code Image} in a layer.
 * <p>
 * An instance from this {@code Interface} can be easily over the class
 * {@link com.github.naoghuman.lib.tile.core.TileProvider} generated which is
 * the preferred way.
 *
 * @author Naoghuman
 * @since 0.2.0
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 * @see javafx.scene.image.Image
 */
public interface Tile {

    /**
     * Returned the {@code prefix} from this {@code Tile} which is per definition 
     * the first signs from the image name included first minus.
     * <p>
     * For example given image name {@code "tt-arches.png"} so the prefix will
     * be {@code "tt-"}.
     *
     * @return the prefix from this {@code Tile}.
     */
    public default String getPrefix() {
        return this.getImageName().substring(0, this.getImageName().indexOf("-") + 1); // NOI18N
    }

    /**
     * The autor is the creator from this {@code Tile}.
     * <p>
     * This parameter is optional. If this parameter is {@code NULL} or {@code EMPTY} 
     * then this {@code Getter} return {@link java.util.Optional#empty()}.
     *
     * @return the autor from this {@code Tile}.
     * @see com.github.naoghuman.lib.tile.core.Tile#getAutorUrl()
     * @see java.util.Optional
     */
    public Optional<String> getAutor();

    /**
     * The autor url from this {@code Tile}.
     * <p>
     * This parameter is optional. If the parameter {@code autor} is {@code NULL} 
     * or {@code EMPTY} then this {@code Getter} return {@link java.util.Optional#empty()}.
     *
     * @return the autor url from this {@code Tile}.
     * @see com.github.naoghuman.lib.tile.core.Tile#getAutor()
     * @see java.util.Optional
     */
    public Optional<String> getAutorUrl();

    /**
     * The height from this {@code Tile} image.
     * <p>
     * This parameter can't be {@code <= 0.0d}.
     *
     * @return the height from this {@code Tile} image.
     */
    public double getHeight();

    /**
     * The image name from this {@code Tile}.
     * <p>
     * This parameter can't be {@code NULL} or {@code EMPTY}.
     *
     * @return the image name from this {@code Tile}.
     */
    public String getImageName();

    /**
     * The scope from this {@code Tile}. The scope defines if a {@code Tile} is
     * supported by a {@link com.github.naoghuman.lib.tile.core.TileLoader} or not.
     * <p>
     * This parameter can't be {@code NULL} or {@code EMPTY}.
     *
     * @return the scope from this {@code Tile}.
     * @see com.github.naoghuman.lib.tile.core.TileLoader
     */
    public String getScope();

    /**
     * The title from this {@code Tile}.
     * <p>
     * This parameter can't be {@code NULL} or {@code EMPTY}.
     *
     * @return the title from this {@code Tile}.
     */
    public String getTitle();

    /**
     * The width from this {@code Tile} image.
     * <p>
     * This parameter can't be {@code <= 0.0d}.
     *
     * @return the width from this {@code Tile} image.
     */
    public double getWidth();

}
