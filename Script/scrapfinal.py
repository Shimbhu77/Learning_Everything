from bs4 import BeautifulSoup

html_list = [
     """
      <h1>a</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.67"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.56"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.45"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.34"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.12"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 8.91"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>

    """,
     """
      <h1>b</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.30"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.96"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.62"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.28"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.93"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 9.91"</span>
                                            <span class="height_font">Height : 15.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>

    """,
     """
      <h1>c</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.32"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.09"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.87"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.64"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.19"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.74"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>

    """,
     """
      <h1>d</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.28"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.94"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.60"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.25"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.88"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 9.98"</span>
                                            <span class="height_font">Height : 15.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>

    """,
    """
    <h1>e</h1>
   <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.38"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.18"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.97"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.77"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.63"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.95"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
    <h1>f</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.57"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.83"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.09"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.35"</span>
                                            <span class="height_font">Height : 9.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.40"</span>
                                            <span class="height_font">Height : 13.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.97"</span>
                                            <span class="height_font">Height : 19.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
    <h1>g</h1>
<ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.67"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.21"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.74"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.28"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.42"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 9.10"</span>
                                            <span class="height_font">Height : 17.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
     <h1>h</h1>
     <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.88"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.45"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.03"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.60"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.91"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 8.64"</span>
                                            <span class="height_font">Height : 15.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>

    """,
    """
      <h1>i</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 0.90"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.14"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.34"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.53"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.29"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.87"</span>
                                            <span class="height_font">Height : 15.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>j</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.70"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.98"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.26"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.55"</span>
                                            <span class="height_font">Height : 9.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.68"</span>
                                            <span class="height_font">Height : 13.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.10"</span>
                                            <span class="height_font">Height : 18.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>k</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.70"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.25"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.79"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.33"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.50"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.12"</span>
                                            <span class="height_font">Height : 15.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>l</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 0.84"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.01"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.18"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.34"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.02"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.52"</span>
                                            <span class="height_font">Height : 15.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
     <h1>m</h1>
     <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.19"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.59"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.99"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 8.39"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 11.19"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 13.98"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
     <h1>n</h1>
     <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.48"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.30"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.13"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.96"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.61"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 8.27"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>o</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.13"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.18"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.23"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.27"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 8.36"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 10.46"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>p</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.26"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.92"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.57"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.22"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.84"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 9.80"</span>
                                            <span class="height_font">Height : 15.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>q</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.27"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.92"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.58"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.23"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.70"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.63"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>r</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.39"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.85"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.31"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.78"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.83"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 9.80"</span>
                                            <span class="height_font">Height : 15.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>s</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.43"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.91"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.40"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.89"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.66"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.63"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>t</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.46"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 1.83"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.20"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.56"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.38"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.29"</span>
                                            <span class="height_font">Height : 15.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>u</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.39"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.19"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.98"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.78"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.84"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.76"</span>
                                            <span class="height_font">Height : 13.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>v</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.19"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.92"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.65"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.38"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 8.10"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.97"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>w</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.03"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.05"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.06"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.07"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.45"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.30"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>x</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.42"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.22"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.03"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.84"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.63"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 10.12"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>y</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.76"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.31"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.86"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.42"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.65"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 8.06"</span>
                                            <span class="height_font">Height : 10.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
      <h1>z</h1>
      <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1390.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.12"</span>
                                            <span class="height_font">Height : 3.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹1740.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 2.82"</span>
                                            <span class="height_font">Height : 4.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2090.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 3.53"</span>
                                            <span class="height_font">Height : 5.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 4.24"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹2790.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.85"</span>
                                            <span class="height_font">Height : 12.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3140.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 8.28"</span>
                                            <span class="height_font">Height : 15.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """
   
    # Add more <ul> lists as needed
]

for idx, html in enumerate(html_list, start=1):
    soup = BeautifulSoup(html, 'html.parser')

    # Find and print the counter
    print(f"Set {idx}:")

    # Find and print the alphabet name
    alphabet_name_element = soup.find('h1')
    alphabet_name = alphabet_name_element.text.strip() if alphabet_name_element else "Alphabet not found"
    print("Alphabet : "+alphabet_name)

    sizes = soup.find_all('li')

    for size in sizes:
        size_name_element = size.find('span', class_='size_font')
        if size_name_element:
            size_name = size_name_element.text.strip()
        else:
            size_name = "Size not found"

        length_element = size.find('span', class_='length_font')
        if length_element:
            length = length_element.text.strip().split(":")[1].strip()
        else:
            length = "Length not found"

        height_element = size.find('span', class_='height_font')
        if height_element:
            height = height_element.text.strip().split(":")[1].strip()
        else:
            height = "Height not found"

        formatted_output = f"{size_name} : Width {length}, Height {height}"
        print(formatted_output)
    print()
