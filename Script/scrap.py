from bs4 import BeautifulSoup

html_list = [
    """
      <div
      id="mCSB_2_container"
      class="mCSB_container mCS_y_hidden mCS_no_scrollbar_y"
      style="position: relative; top: 0; left: 0"
      dir="ltr"
    >
      <div class="enter_text">
        <textarea
          id="text2"
          type="text"
          name="entertext"
          placeholder="Please Enter/Return for new line."
        ></textarea>
      </div>
      <div class="choose_fonts">
        <div class="select_option_fonts">Fonts</div>
        <div class="font_selection_wrapper">
          <div class="selected-font">aerolite</div>
          <div class="text-align form-input">
            <a href="javascript:void(0);" alignment="left">
              <span><i class="fa fa-align-left" aria-hidden="true"></i></span>
            </a>
            <a href="javascript:void(0);" alignment="center" class="active">
              <span><i class="fa fa-align-center" aria-hidden="true"></i></span>
            </a>
            <a href="javascript:void(0);" alignment="right"
              ><span>
                <i class="fa fa-align-right" aria-hidden="true"></i
              ></span>
            </a>
          </div>
        </div>
        <div class="all-fonts" style="display: none">
          <ul
            class="col-2-list select-font-style font-style-select"
            id="font-style-list"
          >
            <li
              style="font-family: 'aerolite'"
              data-value="aerolite"
              class="active"
            >
              <a>Aerolite</a>
            </li>
            <li style="font-family: 'anjelika rose'" data-value="anjelika rose">
              <a>Anjelika Rose</a>
            </li>
            <li style="font-family: 'baleno handi'" data-value="baleno handi">
              <a>Baleno Handi</a>
            </li>
            <li
              style="font-family: 'beyond infinity'"
              data-value="beyond infinity"
            >
              <a>Beyond Infinity</a>
            </li>
            <li style="font-family: 'boarding'" data-value="boarding">
              <a>Boarding</a>
            </li>
            <li style="font-family: 'cangeline'" data-value="cangeline">
              <a>Cangeline</a>
            </li>
            <li
              style="font-family: 'chocolate raindrops'"
              data-value="chocolate raindrops"
            >
              <a>Chocolate Raindrops</a>
            </li>
            <li
              style="font-family: 'cursive standard'"
              data-value="cursive standard"
            >
              <a>Cursive Standard</a>
            </li>
            <li style="font-family: 'dailymunt'" data-value="dailymunt">
              <a>Dailymunt</a>
            </li>
            <li style="font-family: 'election day'" data-value="election day">
              <a>Election Day</a>
            </li>
            <li
              style="font-family: 'fenwick outline'"
              data-value="fenwick outline"
            >
              <a>Fenwick Outline</a>
            </li>
            <li style="font-family: 'GALLEDIS'" data-value="GALLEDIS">
              <a>GALLEDIS</a>
            </li>
            <li style="font-family: 'great day'" data-value="great day">
              <a>Great Day</a>
            </li>
            <li style="font-family: 'halimun'" data-value="halimun">
              <a>Halimun</a>
            </li>
            <li style="font-family: 'loverine'" data-value="loverine">
              <a>Loverine</a>
            </li>
            <li style="font-family: 'pseudo'" data-value="pseudo">
              <a>Pseudo</a>
            </li>
            <li style="font-family: 'roboto'" data-value="roboto">
              <a>Roboto</a>
            </li>
            <li style="font-family: 'znikomit'" data-value="znikomit">
              <a>Znikomit</a>
            </li>
            <li style="font-family: 'geliat'" data-value="geliat">
              <a>Geliat</a>
            </li>
            <li style="font-family: 'havelock'" data-value="havelock">
              <a>Havelock</a>
            </li>
            <li style="font-family: 'Salve'" data-value="Salve">
              <a>Salve</a>
            </li>
            <li style="font-family: 'Valgal'" data-value="Valgal">
              <a>Valgal</a>
            </li>
            <li style="font-family: 'Bourton'" data-value="Bourton">
              <a>Bourton</a>
            </li>
            <li style="font-family: 'RM Smoothsans'" data-value="RM Smoothsans">
              <a>RM Smoothsans</a>
            </li>
            <li style="font-family: 'Sidecar'" data-value="Sidecar">
              <a>Sidecar</a>
            </li>
            <li style="font-family: 'LiebeErika'" data-value="LiebeErika">
              <a>LiebeErika</a>
            </li>
            <li style="font-family: 'Shelby'" data-value="Shelby">
              <a>Shelby</a>
            </li>
            <li style="font-family: 'Heiders'" data-value="Heiders">
              <a>Heiders</a>
            </li>
            <li style="font-family: 'Shaker'" data-value="Shaker">
              <a>Shaker</a>
            </li>
            <li style="font-family: 'Dress Quote'" data-value="Dress Quote">
              <a>Dress Quote</a>
            </li>
            <li
              style="font-family: 'CraftyGirlsPro'"
              data-value="CraftyGirlsPro"
            >
              <a>CraftyGirlsPro</a>
            </li>
            <li style="font-family: 'HTNeon'" data-value="HTNeon">
              <a>HTNeon</a>
            </li>
            <li style="font-family: 'Neon Summer'" data-value="Neon Summer">
              <a>Neon Summer</a>
            </li>
            <li
              style="font-family: 'NightLightSquare'"
              data-value="NightLightSquare"
            >
              <a>NightLightSquare</a>
            </li>
            <li style="font-family: 'Local Brewery'" data-value="Local Brewery">
              <a>Local Brewery</a>
            </li>
          </ul>
        </div>
      </div>
      <div class="select_font_size">
        <div class="size-limit-msg" style="display: none">
          <p>
            Signs larger than 46" size will be made on two backboards that can
            be stacked easily together.
          </p>
        </div>
        <div
          id="tabs-sizes"
          class="ui-tabs ui-corner-all ui-widget ui-widget-content"
          style="float: left; width: 100%"
        >
          <ul
            class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all"
            role="tablist"
          >
            <li
              class="isActive ui-state-default ui-corner-top ui-tabs-active ui-state-active"
              role="tab"
              tabindex="0"
              aria-controls="tabs-select"
              aria-labelledby="ui-id-6"
              aria-selected="true"
              aria-expanded="true"
            >
              <a
                href="#tabs-select"
                class="ui-tabs-anchor"
                role="presentation"
                tabindex="-1"
                id="ui-id-6"
                >Select Size</a
              >
            </li>
            <li
              class="ui-state-default ui-corner-top"
              role="tab"
              tabindex="-1"
              aria-controls="tabs-custom"
              aria-labelledby="ui-id-7"
              aria-selected="false"
              aria-expanded="false"
            >
              <a
                href="#tabs-custom"
                class="ui-tabs-anchor"
                role="presentation"
                tabindex="-1"
                id="ui-id-7"
                >Custom Size</a
              >
            </li>
          </ul>

          <div
            id="tabs-select"
            aria-labelledby="ui-id-6"
            class="ui-tabs-panel ui-widget-content ui-corner-bottom"
            role="tabpanel"
            aria-hidden="false"
          >
            <ul
              class="col-2-list select-font-type font-type-select bg-listing"
              id="font-type-list"
            >
              <li data-value="small" class="active">
                <a>
                  <span class="leftsizedata">
                    <span class="size_font"> Small </span>
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
                    <span class="size_font"> Medium </span>
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
                    <span class="size_font"> Large </span>
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
                    <span class="size_font"> X-large </span>
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
                    <span class="size_font"> Xx-large </span>
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
                    <span class="size_font"> Supersized </span>
                    <strong class="price_font">₹3140.00</strong>
                  </span>
                  <span class="rightsizedata">
                    <span class="length_font">Length : 7.95"</span>
                    <span class="height_font">Height : 10.00"</span>
                  </span>
                </a>
              </li>
            </ul>
          </div>
          <div
            id="tabs-custom"
            aria-labelledby="ui-id-7"
            class="ui-tabs-panel ui-widget-content ui-corner-bottom"
            role="tabpanel"
            aria-hidden="true"
            style="display: none"
          >
            <div
              class="custom-slider ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content"
            >
              <span
                tabindex="0"
                class="ui-slider-handle ui-corner-all ui-state-default"
                style="left: 0%"
              ></span>
            </div>
            <p class="mt-10">
              <span class="custom-size">3.00" x 2.38"</span> (H x W)
            </p>
          </div>
        </div>
      </div>
    </div>
    """,
    # Add more <ul> lists as needed
]

# for html in html_list:
#     soup = BeautifulSoup(html, 'html.parser')

#     sizes = soup.find_all('li', class_='active')

#     for size in sizes:
#         size_name = size.find('span', class_='size_font').text.strip()
#         length = size.find('span', class_='length_font').text.strip().split(":")[1].strip()
#         height = size.find('span', class_='height_font').text.strip().split(":")[1].strip()
#         formatted_output = f"- **{size_name}**: Length {length}, Height {height}"
#         print(formatted_output)
#     print()

for html in html_list:
    soup = BeautifulSoup(html, 'html.parser')

    sizes = soup.find_all('li', class_='active')

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

        formatted_output = f"- **{size_name}**: Length {length}, Height {height}"
        print(formatted_output)
    print()
