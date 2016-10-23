(ns hoplon.svg
  (:refer-clojure :exclude [symbol filter mask set use])
  (:require
    [hoplon.core :refer [ensure-kids! do!]]))

(defmethod do! :xlink/*
  [elem kw val]
  (let [xlink "http://www.w3.org/1999/xlink"]
    (.setAttributeNS elem xlink (name kw) val)))

(defn make-svg-ctor [tag]
  (let [xmlns "http://www.w3.org/2000/svg"]
    (fn [& args]
      (-> js/document (.createElementNS xmlns tag) ensure-kids! (apply args)))))

(def a                   (make-svg-ctor "a"))
(def altGlyph            (make-svg-ctor "altGlyph"))
(def altGlyphDef         (make-svg-ctor "altGlyphDef"))
(def altGlyphItem        (make-svg-ctor "altGlyphItem"))
(def animate             (make-svg-ctor "animate"))
(def animateColor        (make-svg-ctor "animateColor"))
(def animateMotion       (make-svg-ctor "animateMotion"))
(def animateTransform    (make-svg-ctor "animateTransform"))
(def circle              (make-svg-ctor "circle"))
(def clipPath            (make-svg-ctor "clipPath"))
(def color-profile       (make-svg-ctor "color-profile"))
(def cursor              (make-svg-ctor "cursor"))
(def defs                (make-svg-ctor "defs"))
(def desc                (make-svg-ctor "desc"))
(def ellipse             (make-svg-ctor "ellipse"))
(def feBlend             (make-svg-ctor "feBlend"))
(def feColorMatrix       (make-svg-ctor "feColorMatrix"))
(def feComponentTransfer (make-svg-ctor "feComponentTransfer"))
(def feComposite         (make-svg-ctor "feComposite"))
(def feConvolveMatrix    (make-svg-ctor "feConvolveMatrix"))
(def feDiffuseLighting   (make-svg-ctor "feDiffuseLighting"))
(def feDisplacementMap   (make-svg-ctor "feDisplacementMap"))
(def feDistantLight      (make-svg-ctor "feDistantLight"))
(def feFlood             (make-svg-ctor "feFlood"))
(def feFuncA             (make-svg-ctor "feFuncA"))
(def feFuncB             (make-svg-ctor "feFuncB"))
(def feFuncG             (make-svg-ctor "feFuncG"))
(def feFuncR             (make-svg-ctor "feFuncR"))
(def feGaussianBlur      (make-svg-ctor "feGaussianBlur"))
(def feImage             (make-svg-ctor "feImage"))
(def feMerge             (make-svg-ctor "feMerge"))
(def feMergeNode         (make-svg-ctor "feMergeNode"))
(def feMorphology        (make-svg-ctor "feMorphology"))
(def feOffset            (make-svg-ctor "feOffset"))
(def fePointLight        (make-svg-ctor "fePointLight"))
(def feSpecularLighting  (make-svg-ctor "feSpecularLighting"))
(def feSpotLight         (make-svg-ctor "feSpotLight"))
(def feTile              (make-svg-ctor "feTile"))
(def feTurbulence        (make-svg-ctor "feTurbulence"))
(def filter              (make-svg-ctor "filter"))
(def font                (make-svg-ctor "font"))
(def font-face           (make-svg-ctor "font-face"))
(def font-face-format    (make-svg-ctor "font-face-format"))
(def font-face-name      (make-svg-ctor "font-face-name"))
(def font-face-src       (make-svg-ctor "font-face-src"))
(def font-face-uri       (make-svg-ctor "font-face-uri"))
(def foreignObject       (make-svg-ctor "foreignObject"))
(def g                   (make-svg-ctor "g"))
(def glyph               (make-svg-ctor "glyph"))
(def glyphRef            (make-svg-ctor "glyphRef"))
(def hkern               (make-svg-ctor "hkern"))
(def image               (make-svg-ctor "image"))
(def line                (make-svg-ctor "line"))
(def linearGradient      (make-svg-ctor "linearGradient"))
(def marker              (make-svg-ctor "marker"))
(def mask                (make-svg-ctor "mask"))
(def metadata            (make-svg-ctor "metadata"))
(def missing-glyph       (make-svg-ctor "missing-glyph"))
(def mpath               (make-svg-ctor "mpath"))
(def path                (make-svg-ctor "path"))
(def pattern             (make-svg-ctor "pattern"))
(def polygon             (make-svg-ctor "polygon"))
(def polyline            (make-svg-ctor "polyline"))
(def radialGradient      (make-svg-ctor "radialGradient"))
(def rect                (make-svg-ctor "rect"))
(def script              (make-svg-ctor "script"))
(def set                 (make-svg-ctor "set"))
(def stop                (make-svg-ctor "stop"))
(def style               (make-svg-ctor "style"))
(def svg                 (make-svg-ctor "svg"))
(def switch              (make-svg-ctor "switch"))
(def symbol              (make-svg-ctor "symbol"))
(def text                (make-svg-ctor "text"))
(def textPath            (make-svg-ctor "textPath"))
(def title               (make-svg-ctor "title"))
(def tref                (make-svg-ctor "tref"))
(def tspan               (make-svg-ctor "tspan"))
(def use                 (make-svg-ctor "use"))
(def view                (make-svg-ctor "view"))
(def vkern               (make-svg-ctor "vkern"))
