multiplesOf3And5 :: Integral a  => a -> a
multiplesOf3And5 n = if n < 3 then 0 else if (mod n 3 == 0) || (mod n 5 == 0) then n + multiplesOf3And5 (n - 1) else multiplesOf3And5 (n - 1)

main = print (multiplesOf3And5 999)
