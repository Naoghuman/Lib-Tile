Lib-Tile
===



Intention
---

`Lib-Tile` is a multi [Maven] project written in [JavaFX] and [NetBeans IDE] 
and provides the functionalities to use and handle easily [Tile]s in your [JavaFX] 
application.

A [Tile] is per definition a little transparent [Image] which overlay a 
background-color or -image with the help of repetitions from the image in a layer.

The current `version` is `0.2.0` from 08.13.2017 (MM.dd.yyyy).

_Image:_ Crimson Night &#040;Dark / Landscape&#041; with different tile images
![different-tile-images_v0.3.0.png][different-tile-images_v0.3.0]

> __Hint__  
> Normally only one [Tile] can shown simultaneously. For demonstration purpose 
> I have merge different [Tile]s in one picture.

> __Hint__  
> This image is from the webpage https://wall.alphacoders.com. The image haven't 
> neither a `created by` or `shared by` flag &#040;see http://alphacoders.com/site/faq &#041;. 
> If anyone is the autor and won't that I use this image here in my open souce 
> project plz send me an email &#040;see [Contact](#Contact)&#041; and I will 
> remove it. Thanks for your great work :smiley:.



Content
---

* [Demo](#Demo)
* [Libraries](#Libraries)
    - [Lib-Tile-Core](#LiTiCo)
    - [Lib-Tile-TransparentTextures](#LiTiTrTe)
    - [Lib-Tile-TransparentTextures-Images](#LiTiTrTeIm)
    - [Lib-Tile-Customized-Examples](#LiTiCuEx)
* [Download](#Download)
* [Requirements](#Requirements)
* [Installation](#Installation)
* [Documentation](#Documentation)
* [Contribution](#Contribution)
* [License](#License)
* [Autor](#Autor)
* [Contact](#Contact)



Demo<a name="Demo" />
---

The application [Lib-Tile-Demo] shows a `demonstration` how to use and handle 
the features from the libraries in the project `Lib-Tile`. 

_Image:_ Demo application  
![demo_v0.3.0.png][demo_v0.3.0]

> __Hint__  
> The library [Lib-Tile-Customized-Examples](#LiTiCuEx) provides different examples 
> about `reduced`, `mixed` and `own` [TileSet]s. This examples are shown in the 
> tab `Customized Tiles`.

For more informations and examples plz see the [ReadMe from Lib-Tile-Demo].



Libraries<a name="Libraries" />
---

Like I said before `Lib-Tile` is a multi [Maven] project which contains different 
`sub-libraries`. Which sub-libraries are the best for you depends from your 
requirements in your project.

To use `Lib-Tile` in your project you need minimal the library `Lib-Tile-Core` 
plus a concrete implementation from an [TileLoader] which loads your own [Tile]s 
images. How that work will be explained in the sub-project [Lib-Tile-Demo](#LiTiDe) 
or have a look into the class [TransparentTexturesTileLoader] from the library 
[Lib-Tile-TransparentTextures-Images](#LiTiTrTeIm).

Natural you can use additional libraries which contains predefined `tilesets`. 
Currently supported is [Transparent Textures] with the libraries 
[Lib-Tile-TransparentTextures](#LiTiTrTe) and [Lib-Tile-TransparentTextures-Images](#LiTiTrTeIm).

In the library [Lib-Tile-Customized-Examples](#LiTiCuEx) different examples shows 
how to used a `reduced`, `mixed` and / or `own` [TileSet].


### Lib-Tile-Core<a name="LiTiCo" />

The library `Lib-Tile-Core` provides the API to load a [Tile] (which is per definition 
a little transparent Image) as a [Background] or an [Image] with a concrete 
implementation from a [TileLoader].

The main point for access the functionalities from this `API` is the class [TileProvider]. 
For example with the method TileProvider#loadAsBackground(TileLoader, Tile) the developer 
can load a [Tile] as an [Background].

_Class [TileProvider]:_
```java
/**
 * The singleton {@code TileProvider} allowed the developer access to all relevant 
 * methods in context from the {@code API} from the library {@code Lib-Tile-Core}.
 * <p>
 * For example with the methods {@code getDefaultTile(XY)} a concrete instance from 
 * the {@code Inteface} {@link com.github.naoghuman.lib.tile.core.Tile} can be created.
 * <br>
 * With the method {@code getDefaultValidator()} the developer have access to a 
 * default implementation from the {@code Inteface} 
 * {@link com.github.naoghuman.lib.tile.core.TileValidator}.
 *
 * @author Naoghuman
 * @since  0.2.0
 * @see    com.github.naoghuman.lib.tile.core.Tile
 * @see    com.github.naoghuman.lib.tile.core.TileValidator
 */
public final class TileProvider
```

For more informations and examples plz see the [ReadMe from Lib-Tile-Core].


### Lib-Tile-TransparentTextures<a name="LiTiTrTe" />

With the library `Lib-Tile-TransparentTextures` the developer have access to the 
tileset `Transparent Textures` from the internet page https://www.transparenttextures.com/ 
through the enum `TransparentTexturesTile`. Momentary that are `396` [Tile]s.

The tile images from this tileset are outsourced in a own library 
`Lib-Tile-TransparentTextures-Images` to reduce the size from this library. One 
more advance is that you can use an `own` [TileLoader] in combination with the 
library `Lib-Tile-TransparentTextures`. So you don't need to include the library 
`Lib-Tile-TransparentTextures-Images` into your project which size is momenatry 
`13MB`.

_Class [TransparentTexturesTile]:_
```java
/**
/**
 * The <code>enum</code> TransparentTexturesTileSet is a collection from 
 {@link com.github.naoghuman.lib.tile.core.Tile}s which representated the 
 * <code>Tileset</code> from the internet page <a href="https://www.transparenttextures.com/">https://www.transparenttextures.com/</a>.
 * <p>
 * The individual {@link com.github.naoghuman.lib.tile.core.Tile} can be loaded over the class 
 * {@link com.github.naoghuman.lib.tile.core.TileProvider} with the help from the concrete class 
 * {@link com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader}.<br>
 * See there the methods 
 * {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(com.github.naoghuman.lib.tile.core.TileLoader, com.github.naoghuman.lib.tile.core.Tile) }
 * and {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(com.github.naoghuman.lib.tile.core.TileLoader, com.github.naoghuman.lib.tile.core.Tile) }.
 * <p>
 * Additional informations:<br>
 * The parameters from the initialisation in this <code>Tileset</code> will be validate with the class 
 * {@link com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator}. <code>DefaultTileValidator</code> 
 * allowed basic checks, for example if a {@link java.lang.String} is <code>NULL</code> or <code>EMPTY</code>.
 * 
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 * @see com.github.naoghuman.lib.tile.core.TileValidator
 * @see com.github.naoghuman.lib.tile.core.internal.DefaultTileValidator
 * @see com.github.naoghuman.lib.tile.transparenttextures.images.TransparentTexturesTileLoader
 */
public final class TransparentTexturesTileSet extends TileSet {
    
    private static final String SCOPE = TransparentTexturesTileLoader.getDefault().getScope();

    /**
     * The <code>Java</code> representation from the tile: 3Px Tile
     */
    public static final Tile TT_3PX_TILE = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-3px-tile.png", "3Px Tile", 100, 100, "Gre3g", "http://gre3g.livejournal.com/"); // NOI18N
    
    /**
     * The <code>Java</code> representation from the tile: 45 Degree Fabric (Dark)
     */
    public static final Tile TT_45_DEGREE_FABRIC_DARK = TileProvider.getDefault().getDefaultTile(SCOPE, "tt-45-degree-fabric-dark.png", "45 Degree Fabric (Dark)", 315, 315, "Atle Mo", "http://atle.co/"); // NOI18N
    
    ...
}
```

For more informations and examples plz see the [ReadMe from Lib-Tile-TransparentTextures].


### Lib-Tile-TransparentTextures-Images<a name="LiTiTrTeIm" />

The library `Lib-Tile-TransparentTextures-Images` contains all images from the 
tileset `Transparent Textures` which can be loaded with the help from the class
[TransparentTexturesTileLoader] (which is contained in the library `Lib-Tile-TransparentTextures`).

_Class [TransparentTexturesTileLoader]:_
```java
/**
 * The singleton <code>TransparentTexturesTileLoader</code> is a concrete implementation 
 * from the <code>Interface</code> {@link com.github.naoghuman.lib.tile.core.TileLoader}.
 * <p>
 * With this class it's possible to load a {@link com.github.naoghuman.lib.tile.core.Tile} 
 * (which is per definition a little transparent Image) from the enum 
 * {@link com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile} as a 
 * {@link javafx.scene.layout.Background} or an {@link javafx.scene.image.Image} with the 
 * help from {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsBackground(TileLoader, Tile)} 
 * or {@link com.github.naoghuman.lib.tile.core.TileProvider#loadAsImage(TileLoader, Tile)}.
 *
 * @author Naoghuman
 * @see com.github.naoghuman.lib.tile.core.Tile
 * @see com.github.naoghuman.lib.tile.core.TileLoader
 * @see com.github.naoghuman.lib.tile.core.TileProvider
 * @see com.github.naoghuman.lib.tile.transparenttextures.TransparentTexturesTile
 * @see javafx.scene.layout.Background
 * @see javafx.scene.image.Image
 */
public final class TransparentTexturesTileLoader extends TileLoader
```

For more informations and examples plz see the [ReadMe from Lib-Tile-TransparentTextures-Images].


### Lib-Tile-Customized-Examples<a name="LiTiCuEx" />

The library `Lib-Tile-Customized-Examples` provides different examples about 
`CustomizedTileSets`. There will be following demonstrations:
* An example which shows how to implemente a `reduced` TileSet. A reduced TileSet 
  contains different predefined `Tiles` from an existing `TileSet` which is in this
  example `TransparentTextures`.
* The next example _(will be implemented in the future)_ shows an `mixed` TileSet. 
  A mixed TileSet contains predefined and own Tiles.
* The last example _(will be implemented in the future)_ shows an `own` TileSet. 
  Like `own` means this example contains only own Tiles.

_Class [CustomizedExampleReducedTileSet]:_
```java
/**
 * TODO
 * 
 * @author Naoghuman
 * @since  0.2.0
 */
public final class CustomizedExampleReducedTileSet extends TileSet
```

For more informations and examples plz see the [ReadMe from Lib-Tile-Customized-Examples].



Download<a name="Download" />
---

Current `version` is `0.2.0`. Main points in this release are:
* This is a mayor update.
* Rework the `api` from the library.
* Add new `TileValidator`.
* Add new sub-library `Lib-Tile-Customized-Examples`.
* Update the documentation and JavaDoc to reflect the changes.

There are different `zip` files as download available. Plz choose the right one 
in dependency from your necessities:
* Download Lib-Tile-Core-0.2.0.zip
    * Contains only the library lib-tile-core-0.2.0.jar.
    * You need to define your own [TileLoader] and your own [Tile]s images in 
      your application.
* Download Lib-Tile-Core-And-TransparentTextures-0.2.0.zip
    * Contains the libraries lib-tile-core-0.2.0.jar, lib-tile-transparenttextures-0.2.0.jar, 
      lib-tile-transparenttextures-images-0.2.0.jar.
    * You can use the predefined tileset `Transparent Textures` in your application.
* Download Lib-Tile-All-0.2.0.zip
    * Contains the libraries lib-tile-core-0.2.0.jar, lib-tile-transparenttextures-0.2.0.jar, 
      lib-tile-transparenttextures-images-0.2.0.jar and lib-tile-customized-examples-0.2.0.jar.

Access to the downloads are here: [Download Lib-Tile]


Requirements<a name="Requirements" />
---

* On your system you need [JRE 8] or [JDK 8] installed.



Installation<a name="Installation" />
---

Depends on your necessities you have different options like in the section 
[Download](#Download) is shown. Download the right `zip` file, extract it and 
include the jar file&#040;s&#041; into your project. That was it :smile: .



Documentation<a name="Documentation" />
---

The projects `Lib-Tile` and `Lib-Tile-Demo` contains in form from the `README.md` 
and the [JavaDoc] the documentation.



Contribution<a name="Contribution" />
---

* If you find a `Bug` I will be glad if you could report an [Issue].
* If you want to `contribute` to the project plz fork the project and do a [Pull Request].



License<a name="License" />
---

The project `Lib-Tile` and all sub-projects are licensed under [General Public License 3.0].



Autor<a name="Autor" />
---

The project `Lib-Tile` and all sub-projects are maintained by me, Peter Rogge. See [Contact](#Contact).



Contact<a name="Contact" />
---

You can reach me under <peter.rogge@yahoo.de>.



[//]: # (Images)
[demo_v0.3.0]:https://user-images.githubusercontent.com/8161815/29042851-02bf3cd4-7bb9-11e7-818d-28c7260c0c25.png
[different-tile-images_v0.3.0]:https://user-images.githubusercontent.com/8161815/29042867-12cc8c62-7bb9-11e7-8780-c6c3e68a2374.png



[//]: # (Links)
[Background]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/Background.html
[CustomizedExampleReducedTileSet]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Customized-Examples/src/main/java/com/github/naoghuman/lib/tile/customized/examples/reducedtileset/CustomizedExampleReducedTileSet.java
[Download Lib-Tile]:https://github.com/Naoghuman/lib-tile/releases
[General Public License 3.0]:http://www.gnu.org/licenses/gpl-3.0.en.html
[Image]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/image/Image.html
[Issue]:https://github.com/Naoghuman/lib-tile/issues
[JavaDoc]:http://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html
[JavaFX]:http://docs.oracle.com/javase/8/javase-clienttechnologies.htm
[JavaFX CSS Reference Guide]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/doc-files/cssref.html
[JDK 8]:http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
[JRE 8]:http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html
[Lib-Tile]:https://github.com/Naoghuman/lib-tile
[Lib-Tile-Demo]:https://github.com/Naoghuman/lib-tile-demo
[LinearGradient]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/paint/LinearGradient.html
[Maven]:http://maven.apache.org/
[NetBeans IDE]:https://netbeans.org/
[Pull Request]:https://help.github.com/articles/using-pull-requests
[RadialGradient]:https://docs.oracle.com/javase/8/javafx/api/javafx/scene/paint/RadialGradient.html
[ReadMe from Lib-Tile-Core]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core
[ReadMe from Lib-Tile-Customized-Examples]:https://github.com/Naoghuman/lib-tile/tree/master/Lib-Tile-Customized-Examples
[ReadMe from Lib-Tile-Demo]:https://github.com/Naoghuman/lib-tile-demo/blob/master/README.md
[ReadMe from Lib-Tile-TransparentTextures]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures
[ReadMe from Lib-Tile-TransparentTextures-Images]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures-Images
[StartApplication]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Demo/src/main/java/com/github/naoghuman/lib/tile/demo/application/StartApplication.java
[Tile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/Tile.java
[TileLoader]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileLoader.java
[TileProvider]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileProvider.java
[TileSet]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-Core/src/main/java/com/github/naoghuman/lib/tile/core/TileSet.java
[Transparent Textures]:https://www.transparenttextures.com/
[TransparentTexturesTile]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures/src/main/java/com/github/naoghuman/lib/tile/transparenttextures/TransparentTexturesTile.java
[TransparentTexturesTileLoader]:https://github.com/Naoghuman/lib-tile/blob/master/Lib-Tile-TransparentTextures/src/main/java/com/github/naoghuman/lib/tile/transparenttextures/images/TransparentTexturesTileLoader.java
