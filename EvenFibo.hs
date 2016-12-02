fibo :: Integral a => a -> a
fibo n
  | n == 1 = 1
  | n == 2 = 2
  | otherwise = fibo (n - 1) + fibo (n - 2)


evenFibo :: Integral a => a -> a
evenFibo n = evenFiboHelper n 1 0


evenFiboHelper :: Integral a => a -> a -> a-> a
evenFiboHelper lim idx sum = do
                               let current = fibo idx
                               if current > lim then sum
                               else if (mod current 2 == 0) then evenFiboHelper lim (idx + 1) (sum + current)
                               else evenFiboHelper lim (idx + 1) sum


main = print (evenFibo 4000000)
