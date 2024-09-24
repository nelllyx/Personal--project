card_number = str(input("Hello, kindly enter your card details to verify: "))
#list_of_numbers = []

def card_type(number):
    card_type = ""
    if len(number) >= 13 and len(number) <= 16:
        if number[0] == '4':
            card_type = "Visa card"
        elif number[0] == '5':
            card_type = "Master card"
        elif number[0] == '3' and number[1] == '7':
            card_type = "American Express card"
        elif number[0] == '6':
            card_type = "Discover card"
        else: card_type = "Invalid"
    else:card_type = "Invalid Card Type"

    return card_type




def double_every_second_digit_from_right_to_left(number):
    total = 0
    multiplied_index = 0
    single_digit = 0
    double_digit = 0
    list_of_numbers = [int(d) for d in str(number)]
    for index in range(len(list_of_numbers) -1, -1, -1):
        if index % 2 == 0:
          multiplied_index =  list_of_numbers[index] * 2
          if multiplied_index < 9:
              single_digit = multiplied_index + single_digit
          elif multiplied_index > 9:
              double_digit += (multiplied_index / 10) + (multiplied_index % 10)
    total = single_digit + double_digit
    return total




def add_up_all_digit_in_odd_places(number):
    sum = 0
    list_of_numbers = [int(d) for d in str(number)]
    for index in range(len(list_of_numbers) -1, -1, -1):
        if index % 2 != 0:
            sum += list_of_numbers[index]
    return sum


def total_of_even_and_odd_steps(odd_numbers, even_numbers):
    total = 0
    validity_status = " "
    total = odd_numbers + even_numbers
    if total % 10 == 0: validity_status = "Valid"
    else: validity_status = "Invalid"
    return validity_status
sum_total = total_of_even_and_odd_steps(double_every_second_digit_from_right_to_left(card_number), add_up_all_digit_in_odd_places(card_number))



def credit_card_validator(type,number,status):
    print("===============================================")
    print("Credit Card Type: " + type)
    print("Credit Card Number: " + str(number))
    print("Credit Card Digit Length: " + str(len(number)))
    print("Credit Card Validity Status: " + status)
    print("===============================================")


credit_card_validator(card_type(card_number), card_number, sum_total)
