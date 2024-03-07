from bs4 import BeautifulSoup

html_list = [
    """
    <ul class="col-2-list select-font-type font-type-select bg-listing" id="font-type-list">
                                                            <li data-value="small" class="active">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Small                                            </span>
                                            <strong class="price_font">₹1615.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 5.08"</span>
                                            <span class="height_font">Height : 6.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="medium">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Medium                                            </span>
                                            <strong class="price_font">₹2015.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 6.05"</span>
                                            <span class="height_font">Height : 7.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Large                                            </span>
                                            <strong class="price_font">₹2440.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 7.14"</span>
                                            <span class="height_font">Height : 8.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="x-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                X-large                                            </span>
                                            <strong class="price_font">₹2890.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 8.25"</span>
                                            <span class="height_font">Height : 9.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="xx-large">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Xx-large                                            </span>
                                            <strong class="price_font">₹3365.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 11.82"</span>
                                            <span class="height_font">Height : 13.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                            <li data-value="supersized">
                                    <a>
                                        <span class="leftsizedata">
                                            <span class="size_font">
                                                Supersized                                            </span>
                                            <strong class="price_font">₹3840.00</strong>
                                        </span>
                                        <span class="rightsizedata">
                                            <span class="length_font">Length : 12.13"</span>
                                            <span class="height_font">Height : 18.00"</span>
                                        </span>
                                    </a>
                                </li>
                                                    </ul>
    """,
    """
"""
    # Add more <ul> lists as needed
]

for html in html_list:
    soup = BeautifulSoup(html, 'html.parser')

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

        formatted_output = f"{size_name}: Length {length}, Height {height}"
        print(formatted_output)
    print()
